package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements IEmployeeService{

	private IEmployeeDAO dao;
	
	public EmployeeServiceImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl:: 1- param constructor");
		this.dao=dao;
	}
	@Override
	public String generateResult(EmployeeDTO dto) throws Exception {
		
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setBasicsal(dto.getBasicsal()); 
		bo.setGrosssal(dto.getBasicsal());
		bo.setNetsal(dto.getBasicsal());
		int count = dao.insert(bo);
		
		return count==0?"Emp Registration failed":"Emp registration succedded";
	}

	
}
