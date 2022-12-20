package Selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsHandling {

	public static void main(String[] args) throws InterruptedException {
		// invocation of the browser... 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\AnotherWorkspace\\BatchNo_35\\chromedriver.exe");
				// creading the object on behalf selenium Interface and Chrome driver class.
				WebDriver driver = new ChromeDriver();
				
				// entering the url
				driver.get("http://demo.guru99.com/test/newtours/");
				// click on maximize button ( maximizing the browser window
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				// linkText as our locator
				driver.findElement(By.linkText("REGISTER")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.name("firstName")).sendKeys("GcReddy");
				
				// to Handle the dropdown we can use Select class
				Select sc = new Select(driver.findElement(By.name("country")));
				sc.selectByVisibleText("INDIA");
				Thread.sleep(1000);
				sc.selectByValue("BELIZE");
				Thread.sleep(1000);
				sc.selectByIndex(2);
				Thread.sleep(1000);

	}

}
