package com.btmatthews.mars.portal.view;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.jcr.Binary;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.commons.io.IOUtils;
import org.thymeleaf.TemplateProcessingParameters;
import org.thymeleaf.resourceresolver.IResourceResolver;

import com.btmatthews.atlas.jcr.JCRAccessor;
import com.btmatthews.atlas.jcr.NodeCallback;

public class PortalResourceResolver implements IResourceResolver {

	private JCRAccessor jcrAccessor;

	public void setJcrAccessor(final JCRAccessor accessor) {
		jcrAccessor = accessor;
	}

	@Override
	public String getName() {
		return "mars-resolver";
	}

	@Override
	public InputStream getResourceAsStream(
			final TemplateProcessingParameters templateProcessingParameters,
			final String resourceName) {
		return jcrAccessor.withNodePath("default", resourceName,
				new NodeCallback<InputStream>() {
					@Override
					public InputStream doInSessionWithNode(
							final Session session, final Node node)
							throws RepositoryException {
						Node resourceNode = node.getNode(Node.JCR_CONTENT);
						Binary data = resourceNode.getProperty(
								Property.JCR_DATA).getBinary();
						byte[] buffer = new byte[(int) data.getSize()];
						try {
							IOUtils.readFully(data.getStream(), buffer);
							return new ByteArrayInputStream(buffer);
						} catch (final IOException e) {
							return new ByteArrayInputStream(new byte[] {});
						} finally {
							data.dispose();
						}
					}
				});
	}
}
