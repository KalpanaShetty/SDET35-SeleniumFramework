package com.parsing.pojo;

public class PojoLibrary2 {
	public String name;
	public String empid;
	public String email;
	public long[] mobNo;

	public PojoLibrary2(String name, String empid, String email, long[] mobNo) {
		super();
		this.name = name;
		this.empid = empid;
		this.email = email;
		this.mobNo = mobNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the empid
	 */
	public String getEmpid() {
		return empid;
	}

	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(String empid) {
		this.empid = empid;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobNo
	 */
	public long[] getMobNo() {
		return mobNo;
	}

	/**
	 * @param mobNo the mobNo to set
	 */
	public void setMobNo(long[] mobNo) {
		this.mobNo = mobNo;
	}

}
