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
		System.out.println("ִ�б�����ķ���֮ǰ�Ĵ���");
		Object result =  arg1.invoke(object, arg2);
		System.out.println("ִ�б�����ķ���֮��Ĵ���");
		return result;
	}
}
