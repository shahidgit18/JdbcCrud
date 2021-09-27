package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmpAssign {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name=>");
		String ename=sc.nextLine();
		System.out.println("Enter employee address=>");
		String eadd=sc.nextLine();
		System.out.println("Enter employee Basic Salary=>");
		String basicsal=sc.nextLine();
		
		EmployeeVO vo=new EmployeeVO();
		vo.setEname(ename);
		vo.setEadd(eadd);
		vo.setBasicsal(basicsal);
		
		MainController controller=factory.getBean("controller",MainController.class);
		
		try {
			String result=controller.processEmp(vo);
			System.out.println("Final Result=>"+result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem --Try again::"+e.getMessage());
		}
	}

}
