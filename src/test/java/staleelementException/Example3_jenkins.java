package staleelementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example3_jenkins 
{

	
	
	@Test
	public void jenkinautorefresh() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.name("j_password")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"right-top-nav\"]/a")).click();
		/*WebElement element =  driver.findElement(By.xpath("//*[@id=\"job_project3\"]/td[3]/a"));
		element.click();
		driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[1]/a[2]")).click();
		Thread.sleep(3000);
		element.click();*/
		WebElement element=driver.findElement(By.xpath("//*[@id=\"projectstatus\"]/tbody/tr[1]/th[3]/a/span"));
		element.click();
		Thread.sleep(10000);
		element.click();
		
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
