package com.spring.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	@Before(value="pointCut()")
	public void before() {
		System.out.println("前置通知");
	}
	@After(value="pointCut()")
	public void after() {
		System.out.println("后置通知");
	}
	@Around(value="pointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前");
		Object result = pjp.proceed();
		System.out.println("环绕通知后");
		return result;
	}
	
	@Pointcut(value="execution(* spring01.*.*(..))")
	public void pointCut() {
		
	}
}
