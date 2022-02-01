package com.vtiger.comcast.genericUtility;

import java.io.FileInputStream;

import java.util.Properties;

public class FileUtility {
	/**
	 * its used to read the data from commonData.properties File based on key which you pass as an argumennt
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/CommonData.properties");
		
		Properties pobj = new Properties();
		pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
	}

}
