package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Puneeth");
		 //WebDriverWait wait=new WebDriverWait(driver, 20);
		 //wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(2000);
        List<WebElement> autosuggestions = driver.findElements(By.xpath("//li[@role='presentation']"));
         
      
        for (WebElement elements : autosuggestions) {
		
		String suggestions = elements.getText();
		System.out.println(suggestions);
		
		if(elements.getText().equalsIgnoreCase("puneeth photos")){
			elements.click();
		}driver.quit();
	}
        
	//driver.quit();
	}

}
