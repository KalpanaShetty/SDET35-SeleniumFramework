package redbus.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllTheLink {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.redbus.in/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("https://www.redbus.in/");
		
		WebElement ele = driver.findElement(By.xpath("//h6[.='Top Operators']"));
		System.out.println(ele.getLocation());
		Point locn = ele.getLocation();
		int x = locn.getX();
		       int y = locn.getY();
		     JavascriptExecutor jse=(JavascriptExecutor) driver;
				jse.executeScript("window.scrollBy("+x+","+y+")");
				Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//h6[.='Top Operators']/..//li"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (WebElement webElement : links) {
    	   System.out.println(webElement.getText());
    	   if(webElement.getText().equalsIgnoreCase(" srs travels")){
    		   System.out.println("srs travels is present");
    	   }
		
	}driver.quit();
	}

}
