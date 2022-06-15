package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class spicejetbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-Notifications");
		WebDriver driver = new ChromeDriver();
		
		 System.setProperty("webDriver.chrome.driver", ".\\chromedriver.exe");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.spicejet.com/");
		 
		 
		 
		 driver.findElement(By.xpath("//div[text()='one way']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='From']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		 
		 //driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/preceding-sibling::div[text()='To']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		 
		 driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79']")).click();
	}

}
