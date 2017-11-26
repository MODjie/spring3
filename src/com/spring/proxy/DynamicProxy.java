package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



public class DynamicProxy implements InvocationHandler{
	
	private Object object;
	
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public DynamicProxy(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("执行被代理的方法之前的代码");
		Object result =  arg1.invoke(object, arg2);
		System.out.println("执行被代理的方法之后的代码");
		return result;
	}
}
