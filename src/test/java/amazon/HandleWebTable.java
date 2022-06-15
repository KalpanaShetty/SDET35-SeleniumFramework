package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		/*     //*[@id="customers"]/tbody/tr[1]/th[1]	
		//*[@id="customers"]/tbody/tr[2]/td[1] tr means row td means column
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]     */
		String beforeXpath="//*[@id='customers']/tbody/tr[" ;
		String afterXpath="]/th[1]";
		for (int i = 2; i <=7; i++) {
			String ActualXpath= beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(ActualXpath));
			System.out.println(element.getText());
			if(element.getText().equalsIgnoreCase("island trading")){
			System.out.println(element.getText()+"is found");
			break;
			}
		}
	}

}
