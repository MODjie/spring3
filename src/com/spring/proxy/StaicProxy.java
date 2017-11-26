package com.spring.proxy;


public class StaicProxy implements SendSomething{
	private ZhuiQiuZhe zqz = new ZhuiQiuZhe("小明","小花");
	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		System.out.println("确定送什么花");
		zqz.sendFlower();
		System.out.println("送花后班花什么反应");
	}

	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		zqz.sendMoney();
		System.out.println("会不会嫌弃1024");
	}
	
}
