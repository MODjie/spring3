package spring01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.UserService;

public class TestUser {

	public static void main(String[] args) {

		BeanFactory context = new ClassPathXmlApplicationContext("aopContext2.xml");
		AopSrc as = (AopSrc) context.getBean("as");
		
		as.update();
	}
}
