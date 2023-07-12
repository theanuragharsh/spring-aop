package com.springaop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AroundAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.springaop.business.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object returnProceed = joinPoint.proceed();

        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time Taken by {} is {}", joinPoint, timeTaken);

        return returnProceed;
    }
}
