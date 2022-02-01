package com.vtiger.comcast.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImp implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		String failedTestName = result.getMethod().getMethodName();
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);
		File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
		String systemDate=new Date().toString().replace(":", "_").replace("", "_");
		try {
			FileUtils.copyFile(srcFile, new File("./ScreenShots/"+failedTestName+"_"+systemDate+".png"));
		} catch (IOException e) {
			
		}
	}

}
