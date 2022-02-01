package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	public OrganizationInfoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="dvHeaderText")
	private WebElement orgHeaderSucMsg;
	
	@FindBy(id="dtlview_Industry")
    private WebElement industriesInfo;
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
    private WebElement succesfullMsg;
	
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
	
	
     /**
	 * @return the industriesInfo
	 */
	public WebElement getIndustriesInfo() {
		return industriesInfo;
	}

	
}
