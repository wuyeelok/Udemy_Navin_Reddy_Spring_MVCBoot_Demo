package com.kenneth.springmvcboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Before("execution(public java.util.List<com.kenneth.springmvcboot.model.Alien> com.kenneth.springmvcboot.AlienController.getAliens(..))")
	public void logBefore() {
		LOGGER.trace("AlienController getAliens method called from aspect");
	}

	@After("execution(public java.util.List<com.kenneth.springmvcboot.model.Alien> com.kenneth.springmvcboot.AlienController.getAliens(..))")
	public void logAfter() {
		LOGGER.trace("After AlienController getAliens method called from aspect no matter there is exception or not");
	}

	@AfterReturning("execution(public java.util.List<com.kenneth.springmvcboot.model.Alien> com.kenneth.springmvcboot.AlienController.getAliens(..))")
	public void logSuccess() {
		LOGGER.trace("AlienController getAliens method executed without error");
	}

	@AfterThrowing("execution(public java.util.List<com.kenneth.springmvcboot.model.Alien> com.kenneth.springmvcboot.AlienController.getAliens(..))")
	public void logException() {
		LOGGER.error("AlienController getAliens have error");
	}

	@Before("execution(public String com.kenneth.springmvcboot.HomeController.home())")
	public void logIndexPage() {
		LOGGER.trace("Calling HomeController home method");
	}

	@Before("execution(public void com.kenneth.springmvcboot.HomeController.modelData(..))")
	public void logModelData() {
		LOGGER.trace("calling @ModelAttribute model data method");
	}

	@Before("execution(public String com.kenneth.springmvcboot.HomeController.addAlien(..))")
	public void logAddAlien() {
		LOGGER.trace("calling HomeController addAlien method");
	}

}
