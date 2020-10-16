package staleelementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//Scenario goto page click button1 it will goto new page click button2 and come back to old page try to click button1 
public class example1 
{
	WebDriver driver;
	
	@Test
	public void method1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://live.skillrary.com/testing-app");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//handling using pageobjectmodel so using reusable methods we again find and click 
		
		Pageclassforexample1 page1 = new Pageclassforexample1(driver);
		page1.feebback();
		page1.download();
		driver.navigate().back();
		page1.feebback();
		
		
		/* only handling the issue with try catch so next line will execute.
		WebElement ele1= driver.findElement(By.xpath("//a[.='FEEDBACK']"));
		ele1.click();
		WebElement ele2= driver.findElement(By.name("downloadInvoice"));
		ele2.click();
		driver.navigate().back();
		
		try
		{
		ele1.click();
		}
		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		
	System.out.println("exception captured and next line executed");*/			
	}
	

	
}
