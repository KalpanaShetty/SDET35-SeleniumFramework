package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 
	//Rule:1 Create a separate java class for every page in a application
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")      
	//Rule:2 Identify all the elements using @findby, @findall (Declaration)
    private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement userPasswordEdt;
	
	@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="//input[@id='submitButton']")})
	private WebElement loginBtn;
	//Rule:4 Declare all the elements as private & provide getters method, business method for(utilization)

   
   //step1: login
   public void loginToApp(String userName, String password){
	userNameEdt.sendKeys(userName);
	userPasswordEdt.sendKeys(password);
	loginBtn.click();
    }


/**
 * @return the userNameEdt
 */
public WebElement getUserNameEdt() {
	return userNameEdt;
}


/**
 * @return the userPasswordEdt
 */
public WebElement getUserPasswordEdt() {
	return userPasswordEdt;
}


/**
 * @return the loginBtn
 */
public WebElement getLoginBtn() {
	return loginBtn;
}












}
