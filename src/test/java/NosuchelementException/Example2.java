package NosuchelementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{

	//in this window chat box is inframe and if we not switch to iframe 
	//and try to click one element then it is throwing error message. 
	@Test
	public void scenario1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		driver.switchTo().frame("intercom-launcher-frame");
		
		driver.findElement(By.xpath("//div[@class='intercom-crher1 e2ujk8f3']")).click();
		
			
	}


}
