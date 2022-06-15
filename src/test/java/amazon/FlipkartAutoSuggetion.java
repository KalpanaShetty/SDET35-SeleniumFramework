package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggetion {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//div[@class='xtXmba' and .='Mobiles']")).click();
        
        //driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
        //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//driver.quit();
	}

}
