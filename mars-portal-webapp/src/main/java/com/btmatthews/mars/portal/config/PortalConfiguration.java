package com.btmatthews.mars.portal.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.resourceresolver.IResourceResolver;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import com.btmatthews.atlas.jcr.config.PooledRepositoryConfiguration;
import com.btmatthews.mars.portal.view.PortalResourceResolver;

@Configuration
@Import({ PooledRepositoryConfiguration.class })
@ComponentScan("com.btmatthews.mars.portal")
public class PortalConfiguration {

	@Bean(autowire = Autowire.BY_TYPE)
	public IResourceResolver getResourceResolver() {
		return new PortalResourceResolver();
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public ITemplateResolver getTemplateResolver() {
		TemplateResolver templateResolver = new TemplateResolver();
		templateResolver.setCacheable(true);
		templateResolver.setCacheTTLMs(Long.valueOf(300));
		templateResolver.setCharacterEncoding("UTF-8");
		return templateResolver;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public SpringTemplateEngine getTemplateEngine() {
		final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		return templateEngine;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public ViewResolver getViewResolver() {
		final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setOrder(1);
		viewResolver.setViewNames(new String[] { "*" });
		return viewResolver;
	}
}
