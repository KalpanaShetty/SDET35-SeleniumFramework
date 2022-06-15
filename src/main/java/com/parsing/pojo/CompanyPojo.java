package com.parsing.pojo;

public class CompanyPojo {
	
	public String CompName;
	public String empno;
	public int[] phoneNo;
	Object[] empDetails;
	
	public CompanyPojo(String compName, String empno, int[] phoneNo, Object[] empDetails) {
		super();
		this.CompName = compName;
		this.empno = empno;
		this.phoneNo = phoneNo;
		this.empDetails = empDetails;
	}

	/**
	 * @return the compName
	 */
	public String getCompName() {
		return CompName;
	}

	/**
	 * @param compName the compName to set
	 */
	public void setCompName(String compName) {
		CompName = compName;
	}

	/**
	 * @return the empno
	 */
	public String getEmpno() {
		return empno;
	}

	/**
	 * @param empno the empno to set
	 */
	public void setEmpno(String empno) {
		this.empno = empno;
	}

	/**
	 * @return the phoneNo
	 */
	public int[] getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the empDetails
	 */
	public Object[] getEmpDetails() {
		return empDetails;
	}

	/**
	 * @param empDetails the empDetails to set
	 */
	public void setEmpDetails(Object[] empDetails) {
		this.empDetails = empDetails;
	}
	

}
