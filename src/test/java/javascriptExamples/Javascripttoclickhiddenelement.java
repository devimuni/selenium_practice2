package javascriptExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascripttoclickhiddenelement 
{
	@Test
	public void scenario1() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html?e=1");

	//Scenario wait the chat boat page load completely and then try to click on a link which is hidden by the frame
	//we will not able to click it using normal way we need to use java script to click on the hidden link
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name='intercom-launcher-frame']")));
	
	//try to switch to default content and try to click selnium jobs link.
	//normal method we cannot click because it is hidden by frame, so we use javascript
		
		Thread.sleep(3000);
	
	driver.switchTo().defaultContent();
	WebElement element1=driver.findElement(By.linkText("Selenium Jobs"));
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();",element1);
	

	}
	
}
