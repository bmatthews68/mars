package com.btmatthews.mars.portal.service;

import javax.jcr.Repository;
import javax.naming.NamingException;

import org.springframework.jndi.JndiTemplate;
import org.springframework.stereotype.Component;

import com.btmatthews.atlas.jcr.RepositoryProvider;

@Component
public class PortalRepositoryProvider implements RepositoryProvider {

	public Repository getRepository() {
		JndiTemplate jndiTemplate = new JndiTemplate();
		try {
			return jndiTemplate.lookup("jcr/mars", Repository.class);
		} catch (final NamingException e) {
			return null;
		}
	}
}
