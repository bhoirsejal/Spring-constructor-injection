package com.jsp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Pen pen=(Pen) applicationContext.getBean("myPen");
		pen.print();
	}

}
