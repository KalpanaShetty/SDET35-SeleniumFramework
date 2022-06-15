package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage 
{
	WebDriver driver;
	
	public OrganizationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   /**
	 * @return the searchEdt
	 */
	public WebElement getSearchEdt() 
	{
		return searchEdt;
	}

	/**
	 * @return the searchBtn
	 */
	public WebElement getSearchBtn()
	{
		return searchBtn;
	}

	@FindBy(xpath="//img[@title='Create Organization...']")
    private WebElement createOrgImg;
    
   @FindBy(name="search_text")
   private WebElement searchEdt;
   
   @FindBy(name="search")
   private WebElement searchBtn;
   
   
   
   
   /**
 * @return the driver
 */
public WebDriver getDriver() {
	return driver;
}
/**
 * 
 * @return
 */
public WebElement getCreateOrgImg(){
	   
	return createOrgImg;
}
}
