package com.nt.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {

	public Cricketer(){
		System.out.println("Cricket:: 0-param constructor");
	}
	
	public void  bowling(){
		System.out.println("Cricketer is bowling");
	}
	
	public void fielding() {
		System.out.println("Cricketer is fielding");
	}
	
	public void wicketkeeping() {
		System.out.println("Cricketer is keeping wicketes");
	}
	
	public void batting() {
		System.out.println("cricketer is batting");
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Bat bat=ctx.getBean("bat",Bat.class);
		System.out.println("crickter score is"+bat.scoreRuns());
	}
}
