package com.spring.proxy;


public class StaicProxy implements SendSomething{
	private ZhuiQiuZhe zqz = new ZhuiQiuZhe("С��","С��");
	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		System.out.println("ȷ����ʲô��");
		zqz.sendFlower();
		System.out.println("�ͻ���໨ʲô��Ӧ");
	}

	@Override
	public void sendMoney() {
		// TODO Auto-generated method stub
		zqz.sendMoney();
		System.out.println("�᲻������1024");
	}
	
}
