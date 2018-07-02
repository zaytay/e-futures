/**
 * 
 */
package com.tay.futures.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


public class SpringContainerHolder implements ApplicationContextAware {

	private static ApplicationContext appContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContainerHolder.appContext=applicationContext;
	}

	public static ApplicationContext getAppContext(){
		return appContext;
	}

	public static <T> T getBean(String beanName, Class<T> requiredType){
		Assert.notNull(appContext, "'appContext' not initialized");
		Assert.notNull(requiredType, "'requiredType' required");
		return appContext.getBean(beanName, requiredType);
	}
}
