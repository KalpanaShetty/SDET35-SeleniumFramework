package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejet {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='From']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		 
		 //driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/preceding-sibling::div[text()='To']")).click();
		 
		 driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		 
		 driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-1b6yd1w r-1kfrs79']")).click();
		
		
		
		//driver.findElement(By.xpath("//div[.='One Way']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).sendKeys("banglore");
		//driver.findElement(By.xpath("//div[.='Going']")).click();
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-14lw9ot r-z2wwpe r-18u37iz r-1g7fiml r-6e0ovw']")).sendKeys("del");
		//driver.findElement(By.xpath("//div[.='Indira Gandhi International Airport']")).click();
		 // WebDriverWait wait=new WebDriverWait(driver, 20);
       driver.quit();
	}

}
