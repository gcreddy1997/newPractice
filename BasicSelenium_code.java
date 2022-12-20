package Selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium_code {

	public static void main(String[] args) throws InterruptedException {
		
		// invocation of the browser... 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\AnotherWorkspace\\BatchNo_35\\chromedriver.exe");
		// creading the object on behalf selenium Interface and Chrome driver class.
		WebDriver driver = new ChromeDriver();
		
		// entering the url
		driver.get("http://demo.guru99.com/test/newtours/");
		// click on maximize button ( maximizing the browser window
		driver.manage().window().maximize();
		
		//enter the data into username field
		driver.findElement(By.name("userName")).sendKeys("mercury");
		Thread.sleep(1000);
		
		// enter the password field
		driver.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(1000);
		
		// click on submit button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
	}

}
