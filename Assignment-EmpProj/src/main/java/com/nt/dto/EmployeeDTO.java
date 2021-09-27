package com.nt.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeDTO implements Serializable{
	private String ename,eadd;
    private float basicsal;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public float getBasicsal() {
		return basicsal;
	}
	public void setBasicsal(float basicsal) {
		this.basicsal = basicsal;
	}
}

