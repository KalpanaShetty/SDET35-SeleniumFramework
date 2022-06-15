package com.parsing.pojo;

public class PojoLibrary {

	public String name;
	public String empid;
	public String email;
	public int phoneno;
	
	
	
public PojoLibrary() {
	
}
	public PojoLibrary(String name, String empid, String email, int phoneno) {
		super();
		this.name = name;
		this.empid = empid;
		this.email = email;
		this.phoneno = phoneno;
		
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
	 * @return the phoneno
	 */
	public int getPhoneno() {
		return phoneno;
	}

	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	

}
