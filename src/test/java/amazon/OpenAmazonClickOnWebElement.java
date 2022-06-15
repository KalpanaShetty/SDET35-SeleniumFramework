package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAmazonClickOnWebElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element = driver.findElement(By.xpath("//a[@data-csa-c-id='6krlrt-onttpm-2yaw0b-89u8gw']"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(By.xpath("//a[@data-csa-c-id='6krlrt-onttpm-2yaw0b-89u8gw']")).click();
	    
	   
	}

}
