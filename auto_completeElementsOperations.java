package Selenium_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class auto_completeElementsOperations {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\AnotherWorkspace\\BatchNo_36\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maxmimize the window
		driver.manage().window().maximize();
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		// providing 2 selconds of time
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("Kalam");
		Thread.sleep(1000);
		
		for(int i=0; i<5; i++) {
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(500);
		}
		a.sendKeys(Keys.ENTER).build().perform();

	}

}
