package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeServiceImpl;
import com.nt.vo.EmployeeVO;

public class MainController {

	private EmployeeServiceImpl service;
	
	public MainController(EmployeeServiceImpl service) {
		this.service=service;
	}
	
	public String processEmp(EmployeeVO vo)throws Exception{
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setBasicsal(Float.parseFloat(vo.getBasicsal()));

		String result=service.generateResult(dto);
		return result;
	}
}
