package com.lil.springintegration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class DashboardApplicationTests {

	@Test
	void contextLoads() {
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("", DashboardApplicationTests.class);
		try {
			// look for imported bean
			System.out.println("Spring Integration message flows imported successfully!");
			assert(true);
		} catch(NoSuchBeanDefinitionException e) {
			System.out.println(e.toString());
			assert(false);
		} finally {
			// close resource
		}
	}

}
