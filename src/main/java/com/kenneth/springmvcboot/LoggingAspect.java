package com.kenneth.springmvcboot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public java.util.List<com.kenneth.springmvcboot.model.Alien> com.kenneth.springmvcboot.AlienController.getAliens(..))")
	public void log() {
		System.out.println("getAliens method called from aspect");
	}

}
