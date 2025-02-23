package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 周正明
 * @date 2025-02-23
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-test.xml");
		Person  p = applicationContext.getBean(Person.class);
		System.out.println(p.name);
	}
}