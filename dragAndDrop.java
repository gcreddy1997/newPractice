package Selenium_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\AnotherWorkspace\\BatchNo_36\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// maxmimize the window
		driver.manage().window().maximize();
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/droppable/");
		// providing 2 selconds of time
		Thread.sleep(2000);
		
		// drag and Drop option
		Actions a = new Actions(driver);
		// entering in to the frame
		driver.switchTo().frame(0);
		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(e1, e2).build().perform();
		
		driver.switchTo().defaultContent();

	}

}
