package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactinformationPage 
{
	public ContactinformationPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="dvHeaderText")
	private WebElement orgHeaderSucMsg;
	
	
	@FindBy(id="mouseArea_Organization Name")
	private WebElement orgNAmeInfo;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
    private WebElement succesfullMsg;
	
	
	
     /**
	 * @return the orgNAmeInfo
	 */
	public WebElement getOrgNAmeInfo() {
		return orgNAmeInfo;
	}
	
	
	
	/**
	 * @return the orgHeaderSucMsg
	 */
	public WebElement getOrgHeaderSucMsg() {
		return orgHeaderSucMsg;
	}

	
	
	/**
	 * @return the succesfullMsg
	 */
	public WebElement getSuccesfullMsg() {
		return succesfullMsg;
		
	}
     
	}

	


