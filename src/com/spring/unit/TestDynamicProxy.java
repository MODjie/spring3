package com.spring.unit;

import java.lang.reflect.Proxy;

import com.spring.proxy.DynamicProxy;
import com.spring.proxy.SendSomething;
import com.spring.proxy.ZhuiQiuZhe;

public class TestDynamicProxy {
	public static void main(String[] args) {
		ZhuiQiuZhe zqz = new ZhuiQiuZhe("小明", "小花");
		DynamicProxy dp = new DynamicProxy(zqz);
		SendSomething ss = (SendSomething) Proxy.newProxyInstance(dp.getClass().getClassLoader(),
				zqz.getClass().getInterfaces(), dp);
		ss.sendFlower();
		ss.sendMoney();
	}
}
