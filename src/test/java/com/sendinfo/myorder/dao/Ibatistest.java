package com.sendinfo.myorder.dao;

import java.sql.Timestamp;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sendinfo.myorder.model.User;

public class Ibatistest {
	 private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext 
	 static{
		 applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");  
	 }
	public static void main(String[] args) {
	UserDao userDao=	(UserDao) applicationContext.getBean("userDao");
		 System.out.println("nihao");
			System.out.println("nihao");
			User user=new User();
			user.setEmail("longfei.hu1@zhiyoubao.com");
			user.setUserName("longfei.hu");
			user.setDeleted(false);
			user.setCreateTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			user.setModifiedTime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			user.setMobile("12345678");
			user.setNow(new Timestamp(Calendar.getInstance().getTimeInMillis()));
			userDao.addUser(user);

	}

}
