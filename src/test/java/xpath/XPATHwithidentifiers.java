package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATHwithidentifiers 
{

	
	WebDriver driver;
	@Test
	public void samplepage()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		WebElement id= driver.findElement(By.xpath("//input[@id='name']"));
		System.out.println(id.getAttribute("id"));
		
		WebElement name =driver.findElement(By.xpath("//input[@name='enter-name']"));
		System.out.println(name.getAttribute("name"));
		
		
		WebElement classname= driver.findElement(By.xpath("//input[@class='inputs']"));
		System.out.println(classname.getAttribute("class"));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
