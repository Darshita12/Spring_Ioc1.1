package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.StudentBean;

public class StudentClient {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/ApplicationContext.xml");
		StudentBean studentBean=(StudentBean)ctx.getBean("stu");
		studentBean.display();
	}

}
