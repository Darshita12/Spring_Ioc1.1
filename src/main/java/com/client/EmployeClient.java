package com.client;

import java.util.Scanner;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.bean.EmployeBean;
import com.config.ConfigurationEmploye;

public class EmployeClient {

	public static void main(String[] args) {
		//container
		//lazy loading
		/*
		 * FileSystemResource res=new
		 * FileSystemResource("src/main/java/com/ApplicationContext.xml");
		 * XmlBeanFactory factory=new XmlBeanFactory(res); EmployeBean
		 * employeBean=(EmployeBean)factory.getBean("emp"); //early loading
		 * ApplicationContext ctx=new
		 * FileSystemXmlApplicationContext("src/main/java/com/ApplicationContext.xml");
		 * EmployeBean employeBean2=ctx.getBean("emp",EmployeBean.class);
		 * employeBean.display(); employeBean2.display(); ApplicationContext ctx1=new
		 * FileSystemXmlApplicationContext("src/main/java/com/ApplicationContext.xml");
		 * EmployeBean employeBean3=(EmployeBean)ctx.getBean("stu");
		 * System.out.println(employeBean3);
		 */
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationEmploye.class);
		EmployeBean employeBean4=ctx.getBean("emp",EmployeBean.class);
		employeBean4.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employeid");
		int sid=sc.nextInt();
		employeBean4.seteId(sid);
		employeBean4.display();
		
		
	}
}
