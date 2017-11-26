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
		int a = 0;

		if (a==3) {

			System.out.println("zzzzzz");
		}else if (a==2) {
			System.out.println("yyyy");

		}
	}
}
