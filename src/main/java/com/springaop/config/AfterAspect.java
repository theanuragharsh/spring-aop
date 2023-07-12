package com.springaop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value = "com.springaop.config.CommonJoinPointConfig.businessLayerExecution()",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "com.springaop.config.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }
}
