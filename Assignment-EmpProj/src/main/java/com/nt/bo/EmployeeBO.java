package com.nt.bo;

public class EmployeeBO {

	private String ename;
	private String eadd;
	private float basicsal;
	private float grosssal;
	private float netsal;
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
	public float getGrosssal() {
		return grosssal;
	}
	public void setGrosssal(float basicsal) {
		this.grosssal = basicsal+basicsal*40/100;
	}
	public float getNetsal() {
		return netsal;
	}
	public void setNetsal(float basicsal) {
		this.netsal = (basicsal+basicsal*40/100)-(basicsal+basicsal*40/100)*10/100;
	}
}
