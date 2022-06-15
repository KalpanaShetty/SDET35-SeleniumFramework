package com.parsing.pojo;

public class PojoSpouseLibrary {
	public String name;	
	public String email;
	public int phoneno;
	
	public PojoSpouseLibrary(String name, String email, int phoneno) {
		super();
		this.name = name;
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
