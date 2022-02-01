package com.vtiger.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositarylib.ContactinformationPage;
import com.vtiger.comcast.pomrepositarylib.Contacts;
import com.vtiger.comcast.pomrepositarylib.CreateNewContacts;
import com.vtiger.comcast.pomrepositarylib.CreateNewOrganizationPage;
import com.vtiger.comcast.pomrepositarylib.HomePage;
import com.vtiger.comcast.pomrepositarylib.OrganizationInfoPage;
import com.vtiger.comcast.pomrepositarylib.OrganizationsPage;

public class CreateContactTest extends BaseClass{
@Test (groups="SmokeTest")

public void createcontactTest() throws Throwable
{
		//read test data
	   String lastName = elib.getDataFromExcel("contact", 1, 2)+"-"+jLib.getRandomNumber();
	  
//step 2:- navigate to  home page
	   HomePage hp = new HomePage(driver);
	   hp.getContactLnk().click();
//step 3:-  create new contact   
	Contacts cp = new Contacts(driver);
	cp.getCreateContactImg().click();
//step 4 :- create contact
	   CreateNewContacts cnp=new CreateNewContacts(driver);
	   cnp.createContact(lastName);
//step 5:- verify the contact details
	   ContactinformationPage ci= new ContactinformationPage(driver);
            String actLstName = ci.getOrgHeaderSucMsg().getText();
  Assert.assertTrue(actLstName.contains(lastName));          
           
	System.out.println("contact last name is verified==pass");
}

@Test(groups="Regression Test")
public void createcontactTestWithOrgTest() throws Throwable

{
	//read test data
   String contactName = elib.getDataFromExcel("contact", 4, 2)+"-"+jLib.getRandomNumber();
   String orgName = elib.getDataFromExcel("contact", 4, 3)+"-"+jLib.getRandomNumber();
   
 //step 2:- navigate to  Org page
    HomePage hp =new HomePage(driver);
   hp.getOrganizationLnk().click();
   
   //step 3:- navigate create new org page  
  OrganizationsPage op = new OrganizationsPage(driver);
  op.getCreateOrgImg().click();
  
  //step 4 :- create Org

  CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
  cnop.createOrg(orgName);
  
  //*step5:-navigate to contact page
  
  OrganizationInfoPage oi= new OrganizationInfoPage(driver);
Assert.assertTrue(oi.getOrgHeaderSucMsg().getText().contains(orgName)); 
System.out.println("organization created succesfully");

  wLib.waitForElementVisibility(driver, oi.getSuccesfullMsg());
   hp.getContactLnk().click();
  
//*step6:-navigate to create new contact page
  Contacts cp = new Contacts(driver);
  cp.getCreateContactImg().click();
  
//*step7:-create a new contact with orgName page
  CreateNewContacts cnp=new CreateNewContacts(driver);
  cnp.createContact(contactName, orgName);
  
  //*step8-verify
  ContactinformationPage ci= new ContactinformationPage(driver);
  String actLstName = ci.getOrgHeaderSucMsg().getText();
  
  Assert.assertTrue(actLstName.contains(contactName));          
  
	
System.out.println("contact with organization is verified ==pass");



	
	
	
}



}
