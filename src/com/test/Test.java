package com.test;

import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by InnoXYZ on 14-5-30.
 */
public class Test {
	public static void main(String[] args){
		//我们首先使用传统的方式来调用UserService的sayHello方法。
//		UserService userService=new UserService();
//		userService.setName("lishuang");
//		userService.sayHello();

		//接着我们来使用spring来完成上述工作。
		//1.得到spring的applicationContext对象（容器对象）
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us= (UserService) ac.getBean("userService");
		us.sayHello();


	}
}
