package com.devopsbuddy.web.i18n;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;


/**
 * @author RAVI
 *
 */
@Service
public class I18NService {

	@Autowired MessageSource messageSource;
	
	/**
	 * Returns a message for the given message id and the default locale in the session 
	 * context
	 * @param messageId
	 * @return
	 */
	public String getMessage(String messageId){
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId, locale);
	}
	
	/**
	 * REturns a message for given message Id and locale
	 * @param messageId
	 * @param locale
	 * @return
	 */
	public String getMessage(String messageId, Locale locale){
		return messageSource.getMessage(messageId, null, locale);
	}
}
