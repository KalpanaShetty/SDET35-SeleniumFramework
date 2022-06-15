package practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.comcast.genericUtility.BaseClass;
import com.vtiger.comcast.pomrepositarylib.CreateNewOrganizationPage;
import com.vtiger.comcast.pomrepositarylib.HomePage;
import com.vtiger.comcast.pomrepositarylib.OrganizationInfoPage;
import com.vtiger.comcast.pomrepositarylib.OrganizationsPage;

public class DataProviderTest extends BaseClass {
	@Test(dataProvider="orgNameWithIndustry")
	public void createOrg(String orgName, String Industries) throws Throwable {
		
		 
		    
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
	
	@DataProvider
	public Object[][] orgNameWithIndustry() throws Throwable{
		
		//read test data from excel to data provider
		  // String orgName = elib.getDataFromExcel("org", 4, 2)+"-"+jLib.getRandomNumber();
		 //  String Industries = elib.getDataFromExcel("org", 4, 3);
		
				
		Object[][] objArr= new Object[4][2];
		
		objArr[0][0] = elib.getDataFromExcel("contact", 8, 0);
		objArr[0][1] = elib.getDataFromExcel("contact", 8, 1);
		
		objArr[1][0] = "Y";
		objArr[1][1] = "Finance";
		
		objArr[2][0] = "Z";
		objArr[2][1] = "Management";
		
		objArr[3][0] = "W";
		objArr[3][1] ="Steel industry";
		
		
		return objArr;
	}

}
