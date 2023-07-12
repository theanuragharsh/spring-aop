package com.springaop.config;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonJoinPointConfig {

    @Pointcut("execution(* com.springaop.dao.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void multipleLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanWithStringDao() {
    }

    @Pointcut("within(com.springaop.dao..*)")
    public void dataLayerExecutionWithWithin() {
    }

}
