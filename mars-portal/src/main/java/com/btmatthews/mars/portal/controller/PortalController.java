package com.btmatthews.mars.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PortalController.class);

	@RequestMapping("/pages/{page}.html")
	public String showPage(
			@RequestHeader(value = "x-mars-portal", defaultValue = "default") final String portal,
			@PathVariable("page") final String page) {
		LOGGER.debug("showPage(portal={},page={}", portal, page);
		return page;
	}
}
