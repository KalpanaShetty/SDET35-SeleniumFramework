package com.vtiger.comcast.genericUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;
/**
 * This class contains Java specific generic libraries
 * @author Kalpana Shetty
 *
 */
public class JavaUtility 
 {
	/**
	 * This method is used to generate the integer RanDom number with in the boundary of 0 to 1000
	 * @return
	 */
    public int getRandomNumber()
     {
	Random random = new Random();
	int randomNum =  random.nextInt(1000);
	return randomNum;
     }
      /**
       * This method is used to get the current System date and Time
       * @return
       */
     public String getSystemDate()
      {
       Date date = new Date();
       String systemDateAndTime = date.toString();
       return systemDateAndTime;
      }
     /**
      * This method will return date in YYYY-MM-DD format
      * @return
      */
     public String getSystemDate_YYYY_MM_DD(){
    	 Date date = new Date();
         String systemDateAndTime = date.toString();  
         String[] arr = systemDateAndTime.split("");
         String DD = arr[2];
         String YYYY = arr[5];
         String MM = arr[1];
         String finalFormat=YYYY+"-"+MM+"-"+DD;
         return finalFormat;
     }
     /**
      * This is used to pass Virtual key to OS
      * @throws Throwable
      */
     public void pressVirtualKey() throws Throwable
     {
    	 Robot rc = new Robot();
    	 rc.keyPress(KeyEvent.VK_ENTER);
    	 rc.keyPress(KeyEvent.VK_ENTER);
     }
 }
