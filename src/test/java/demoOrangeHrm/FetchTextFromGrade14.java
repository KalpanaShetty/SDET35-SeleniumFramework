package demoOrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFromGrade14 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewAdminModule");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
        driver.findElement(By.xpath("//a[.='Pay Grades']")).click();
        driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_8']")).click();
        String sect = driver.findElement(By.xpath("//a[text()='Grade 14']/parent::td/following-sibling::td[@class='left']")).getText();
        System.out.println(sect);
	
	}

}
