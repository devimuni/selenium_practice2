package staleelementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Scenario goto a page and select a check box and refresh the page and try to select check box again
public class Example2 
{
	@Test
	public void scenario2()
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		/*exception scenario1
		WebElement ele =driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		ele.click();
		driver.get(driver.getCurrentUrl());
		try
		{
			ele.click();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("exception captured and next line executed");*/
		
		Pageclassforexample2 page2=new Pageclassforexample2(driver);
		page2.checkbox();
		driver.get(driver.getCurrentUrl());
		page2.checkbox();
		
		
		
		
	}

	
	
	
	

}
