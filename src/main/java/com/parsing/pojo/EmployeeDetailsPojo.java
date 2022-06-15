package com.parsing.pojo;

public class EmployeeDetailsPojo {
String name;
String empno;
String PhoneNo;
String email;
public EmployeeDetailsPojo(String name, String empno, String phoneNo, String email) {
	super();
	this.name = name;
	this.empno = empno;
	this.PhoneNo = phoneNo;
	this.email = email;
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
public String getPhoneNo() {
	return PhoneNo;
}
/**
 * @param phoneNo the phoneNo to set
 */
public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
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


}
