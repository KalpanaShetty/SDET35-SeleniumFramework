package com.vtiger.comcast.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.comcast.pomrepositarylib.HomePage;
import com.vtiger.comcast.pomrepositarylib.LoginPage;

public class BaseClass {
	
	//Baseclass is updated
	
	public WebDriver driver = null;
	// create Objects
	public ExcelUtility elib = new ExcelUtility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	public static WebDriver sDriver = null;
	

	@BeforeSuite(groups={"SmokeTest","Regression Test"})

	public void configBS()

	{
		System.out.println("connect to DB");
	}
	
	
    //@Parameters("browser")
	@BeforeClass(groups={"SmokeTest","Regression Test"})

	public void configBC(/*String BROWSER*/ ) throws Throwable 
	{                      //chrome-suite xml file-testng
    	                   //firefox-suite xml
    	
    	
		String BROWSER = fLib.getPropertyKeyValue("browser");
		 String URL = fLib.getPropertyKeyValue("url");
		System.out.println("Launch the browser");
		
		   if (BROWSER.equalsIgnoreCase("firefox")){
			   driver =new FirefoxDriver();
		   }else if (BROWSER.equalsIgnoreCase("chrome")){
			   driver = new ChromeDriver();
		   }else {
			   driver =new ChromeDriver();
		   }
		
		wLib.waitUntilPageLoad(driver);
		driver.get(URL);
		sDriver=driver;
		driver.manage().window().maximize();
	}
	
	
	
	
	@BeforeMethod(groups={"SmokeTest","Regression Test"})

	public void configBM() throws Throwable 
	{
		System.out.println("login ");
		 
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		LoginPage lp = new LoginPage(driver);
		
	    lp.loginToApp(USERNAME, PASSWORD);
		
	}

    @AfterMethod(groups={"SmokeTest","Regression Test"})

    public void configAM()
    {
    	System.out.println("logout ");
    	 HomePage hp = new HomePage(driver);
    	 hp.logout();
    }
    
    
    @AfterClass(groups={"SmokeTest","Regression Test"})

    public void configAC(){
    	System.out.println("close the browser");
    	driver.quit();
    }
    
    
    
    @AfterSuite(groups={"SmokeTest","Regression Test"})

    public void configAS()
    {
    	System.out.println("close DB");
    }
}

	
