package amazon;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPriceFromAmazon {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(""
				+ "");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
        
        
       JavascriptExecutor jse= (JavascriptExecutor) driver;
      // jse.executeScript(window.scrollBy())
       
        
        
	
	}

}
