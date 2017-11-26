package com.spring.unit;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.proxy.StaicProxy;
import com.spring.proxy.ZhuiQiuZhe;

import spring01.AopSrc;

public class JunitTest {
	@Test
	public void name() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aopContext.xml");
		AopSrc zzq = (AopSrc) context.getBean("as");
		zzq.delete();
	}
}
