package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


/**
 * Configuration class for message resource
 * @author RAVI
 *
 */
@Configuration
public class I18nConfig {
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource () {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:i18n/messages");
		//checks for every new messages
		messageSource.setCacheSeconds(60);
		return messageSource;
	}

}
