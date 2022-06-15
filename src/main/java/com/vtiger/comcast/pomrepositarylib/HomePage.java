package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comcast.genericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility
{
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(linkText="Organizations")
    private WebElement organizationLnk;
    
    @FindBy(xpath="//a[.='Contacts']")
    private WebElement contactLnk;
    
    @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
    private WebElement adminstatorImg;
    
    @FindBy(linkText="Sign Out")
    private WebElement signOutLnk;
    
    
    /**
      * used for app logout
      */
    public void logout(){
    	mouseHover(driver, adminstatorImg);
    	signOutLnk.click();
    }
    
    /**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}


	/**
	 * @return the organizationLnk
	 */
	public WebElement getOrganizationLnk() {
		return organizationLnk;
	}


	/**
	 * @return the contactLnk
	 */
	public WebElement getContactLnk() {
		return contactLnk;
	}


	/**
	 * @return the adminstatorImg
	 */
	public WebElement getAdminstatorImg() {
		return adminstatorImg;
	}


	/**
	 * @return the signOutLnk
	 */
	public WebElement getSignOutLnk() {
		return signOutLnk;
	}


	
    }  
    

