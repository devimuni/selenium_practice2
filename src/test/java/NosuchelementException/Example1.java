package NosuchelementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 
{
	//scenario1: time sync issue handle with implicit wait, issue will come if we don't use implicit wait
	//@Test
	public void scenario1()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		WebElement ele = driver.findElement(By.id("user_email"));
		ele.sendKeys("testing");
	}

//Scenario2: time sync issue handle with explicitwait

	@Test
	public void scenario2()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		ele.sendKeys("testing");
	}

//refer the below site for other examples https://www.youtube.com/watch?v=y6SYtAh-kCk&pbjreload=101
//it explains example 3 element is in iframe we need to switch to frame
//example 2 try to click login link second time and it link address changed we need to correct the element locator correctly. 
	
}
