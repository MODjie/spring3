package com.spring.proxy;

public class AopAspect {
	public void insert() {
		System.out.println("insert");
	}

	public void update() {
		System.out.println("update");
	}

	public void delete() {
		System.out.println("delete");
	}

	public void query() {
		System.out.println("query");
	}
}
