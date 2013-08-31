package com.btmatthews.mars.portal.model;

public class PortalDescriptor {

	private String domainName;

	public PortalDescriptor(final String domainName) {
        if (domainName == null) {
            throw new IllegalArgumentException("domainName cannot be null");
        }
		this.domainName = domainName;
	}

	public String getDomainName() {
		return this.domainName;
	}
}
