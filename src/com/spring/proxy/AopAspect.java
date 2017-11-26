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
		System.out.println("ǰ��֪ͨ");
	}
	@After(value="pointCut()")
	public void after() {
		System.out.println("����֪ͨ");
	}
	@Around(value="pointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("����֪ͨǰ");
		Object result = pjp.proceed();
		System.out.println("����֪ͨ��");
		return result;
	}
	
	@Pointcut(value="execution(* spring01.*.*(..))")
	public void pointCut() {
		
	}
}
