package elementnotclickableexception;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 
{
	//first wait till the mail chat(iframe) icon is loaded on the page 
	//in this example when we try to click selenium jobs it was over hidden by iframe.
	//we need to switch to frame and minimize and switch to normal window
	//while minimizing if we don't give thread sleep statement then minimize not happening so 
	//selenium jobs is not clickable exceptions occurs.
	@Test
	public void scenario1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("intercom-launcher-frame");
		//we need to click on iframe window twice to minimize the window
		driver.findElement(By.xpath("//div[@class='intercom-crher1 e2ujk8f3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='intercom-1ed15uv e2ujk8f3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='intercom-crher1 e2ujk8f3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='intercom-1ed15uv e2ujk8f3']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[2]/div/a")).click();
		
		
		
		
	}
	
	
	
	
	
	
}
