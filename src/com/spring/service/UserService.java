package com.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.UserDao;

public class UserService {
	 UserDao ud;
	
	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	public void addUser() {
		ud.addUser();
		System.out.println("����userService��add����");
	}
}
