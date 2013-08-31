package com.btmatthews.mars.portal.service;

import javax.jcr.Credentials;

import org.springframework.stereotype.Component;

import com.btmatthews.atlas.jcr.CredentialsProvider;

@Component
public class PortalCredentialsProvider implements CredentialsProvider {

	@Override
	public Credentials getGlobalCredentials() {
		return null;
	}

	@Override
	public Credentials getUserCredentials() {
		return null;
	}
}
