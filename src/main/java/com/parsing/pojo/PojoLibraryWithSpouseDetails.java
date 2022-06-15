package com.parsing.pojo;

public class PojoLibraryWithSpouseDetails {
	public String name;
	public String empid;
	public String email;
	public Object spouse;
	public PojoLibraryWithSpouseDetails(String name, String empid, String email, Object spouse) {
		super();
		this.name = name;
		this.empid = empid;
		this.email = email;
		this.spouse = spouse;
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
	 * @return the spouse
	 */
	public Object getSpouse() {
		return spouse;
	}
	/**
	 * @param spouse the spouse to set
	 */
	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	
}
