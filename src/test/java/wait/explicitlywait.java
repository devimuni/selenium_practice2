package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitlywait 
{
	@Test
	public void scenario1() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html?e=1");

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@name='intercom-launcher-frame']")));
		//driver.switchTo().frame("intercom-launcher-frame");
		//we need to click on iframe window twice to minimize the window
		Thread.sleep(3000);
		//WebElement element1=driver.findElement(By.xpath("//div[@class='intercom-lr0ri6 es6hgh14']"));
	
		/*Actions act = new Actions(driver);
		act.moveToElement(element1).perform();
		driver.findElement(By.xpath("//div[@class='intercom-lr0ri6 es6hgh14']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[2]/div/a")).click();*/
		
		WebElement element1=driver.findElement(By.xpath("//div[@class='intercom-block-paragraph e19rsvrm0 intercom-1d3znxz]"));
		Actions act = new Actions(driver);
		act.moveToElement(element1).perform();
		/*JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element1);*/
	}









}
