package com.vtiger.comcast.organizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositarylib.CreateNewOrganizationPage;
import com.vtiger.comcast.pomrepositarylib.HomePage;
import com.vtiger.comcast.pomrepositarylib.OrganizationInfoPage;
import com.vtiger.comcast.pomrepositarylib.OrganizationsPage;

public class CreateOrgnTest extends BaseClass {
	@Test(groups="SmokeTest")
	public void createOrgnTest() throws Throwable
	{	
				// read test data
				
				String orgName = elib.getDataFromExcel("contact", 4, 3) + "-" + jLib.getRandomNumber();
				
				// step 2:- navigate to Org page
				HomePage hp = new HomePage(driver);
				hp.getOrganizationLnk().click();

				// step 3:- navigate create new org page
				
				OrganizationsPage op = new OrganizationsPage(driver);
				op.getCreateOrgImg().click();
				
				// step 4 :- create Org
				CreateNewOrganizationPage cnop= new CreateNewOrganizationPage(driver);
				cnop.createOrg(orgName);
				
				//ExplicitWait
				OrganizationInfoPage oi= new OrganizationInfoPage(driver);
				
				wLib.waitForElementVisibility(driver, oi.getSuccesfullMsg());

				String actOrgNAme = oi.getOrgHeaderSucMsg().getText();
				
	            Assert.assertTrue(actOrgNAme.contains(orgName));
				System.out.println("organization  created succesfully");
				
	}
	
	@Test(groups="Regression Test")
	public void createOrgnWithIndustriesTest() throws Throwable
	
	{
				
				//read test data
			   String orgName = elib.getDataFromExcel("org", 4, 2)+"-"+jLib.getRandomNumber();
			   String Industries = elib.getDataFromExcel("org", 4, 3);
			 
			    
			    //step 2:- navigate to  Org page
			    HomePage hp =new HomePage(driver);
			   hp.getOrganizationLnk().click();
			   
			   //step 3:- navigate create new org page  
			  OrganizationsPage op = new OrganizationsPage(driver);
			  op.getCreateOrgImg().click();
			  
			  //step 4 :- create Org
			  CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
			  cnop.createOrg(orgName,Industries);
			  
			  
			  //step 5:- verify the org details
			  OrganizationInfoPage oi = new OrganizationInfoPage(driver);
			  wLib.waitForElementVisibility(driver,oi.getSuccesfullMsg() );
			 			 
			 //step 6:- verify industries details
			String actIndustriesInfo = oi.getIndustriesInfo().getText();
			 Assert.assertTrue(actIndustriesInfo.contains(Industries));
				System.out.println("organization  created succesfully");
		
	}

}
