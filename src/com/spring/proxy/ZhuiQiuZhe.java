package com.spring.proxy;

public class ZhuiQiuZhe implements SendSomething{
	private String name;
	private String loverName;
	
	public void sendFlower() {
		System.out.println(this.name+"送1024朵花给"+loverName);
	}
	public void sendMoney() {
		System.out.println(this.name+"送1024元给"+loverName);
	}
	public ZhuiQiuZhe(String name, String loverName) {
		super();
		this.name = name;
		this.loverName = loverName;
	}
	public ZhuiQiuZhe() {
		// TODO Auto-generated constructor stub
	}
}
