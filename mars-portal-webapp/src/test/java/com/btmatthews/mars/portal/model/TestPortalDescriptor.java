package com.btmatthews.mars.portal.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by bmatthews68 on 09/06/2013.
 */
public class TestPortalDescriptor {

    private static final String VALID_DOMAIN_NAME = "mars.btmatthews.com";
    private static final String INVALID_DOMAIN_NAME = "mars+.btmatthews.com";

    @Test
    public void constructWithValidDomainName() {
        final PortalDescriptor portal = new PortalDescriptor(VALID_DOMAIN_NAME);
        assertThat(portal.getDomainName(), is(equalTo(VALID_DOMAIN_NAME)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructWithNullDomainNameThrowsException() {
        new PortalDescriptor(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructWithInvalidDomainNameThrowsException() {
        new PortalDescriptor(INVALID_DOMAIN_NAME);
    }
}
