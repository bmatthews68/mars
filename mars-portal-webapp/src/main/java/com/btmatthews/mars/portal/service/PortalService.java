package com.btmatthews.mars.portal.service;


import com.btmatthews.mars.portal.model.PortalDescriptor;

public interface PortalService {

    PortalDescriptor lookupPortalDescriptor(final String domainName);
}
