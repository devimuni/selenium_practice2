package basicsanity;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogoutusinglist {
	
	@Test
	public void fblogoutlist() throws InterruptedException
	{
		 
		
		WebDriverManager.chromedriver().setup();
		
		// this will handle How To Handle Chrome and Firefox Notification in Selenium using Java
		//YouTube by Mukesh otwani

		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("muninash");
		driver.findElement(By.id("pass")).sendKeys("patnam@8592");
		driver.findElement(By.name("login")).click();
		
		/*Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,180); 
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		((JavascriptExecutor)driver).
		executeScript("window.alert = function(msg){return true;} window.confirm= function(msg){return true;}");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);*/
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@aria-label=\"Account\"]")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		//driver.close();
		
	}
	
	
	
	

}
