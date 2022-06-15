package amazon;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
       Set<String> handles = driver.getWindowHandles();
      Iterator<String> it = handles.iterator();
      String parentWindowid = it.next();
      System.out.println(parentWindowid);
      String childWindowId = it.next();
      driver.switchTo().window(parentWindowid);
      
      driver.switchTo().window(childWindowId);
      System.out.println("child window title"+driver.getTitle());
      driver.close();
      driver.switchTo().window(parentWindowid);
      System.out.println("parent window title"+driver.getTitle()); 

	}

}
