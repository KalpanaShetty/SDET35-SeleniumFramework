package demoOrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookFreeDemo {

	public static void main(String[] args) throws Throwable {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='optanon-allow-all accept-cookies-button']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Kalpana");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Shetty");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("kalpanashetty512@gmail.com");
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        //driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
