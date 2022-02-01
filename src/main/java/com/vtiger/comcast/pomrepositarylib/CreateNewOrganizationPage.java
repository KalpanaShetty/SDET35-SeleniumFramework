package com.vtiger.comcast.pomrepositarylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.comcast.genericUtility.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility {
	
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    @FindBy(name="accountname")
	private WebElement orgNameEdt;
    
    @FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement saveBtn;
    @FindBy(name="industry")
	private WebElement industriesLst ;
    
    /**
	 * @return the industriesLst
	 */
	public WebElement getIndustriesLst() {
		return industriesLst;
	}

	/**
     * @author Kalpana Shetty
     * used to create new org with mandate info
     * @param orgName
     */
    public void createOrg(String orgName){
    	orgNameEdt.sendKeys(orgName);
    	saveBtn.click();
    }
    
    /**
     * used to create new org with orgname & industries
     * @param orgName
     */
    public void createOrg(String orgName,String industries){
    	orgNameEdt.sendKeys(orgName);
    	select(industriesLst,industries);
    	saveBtn.click();
    }
    
    

	/**
	 * @return the orgNameEdt
	 */
	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
