package testNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizeTestNGemailreport 
{

	
	@Test
	public void custTngemailreport() throws IOException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Reporter.log("enter username and passowrd");
		driver.findElement(By.id("name")).sendKeys("naresh");
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("click login button");
		driver.findElement(By.id("login")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;

		File Src = ts.getScreenshotAs(OutputType.FILE);
		String directory = System.getProperty("user.dir") + "/screenshot/";
		new File(directory).mkdirs();
		String path=directory + "customtestngreport.png";
		File Dst = new File(path);
		FileUtils.copyFile(Src,Dst);
		
		
		//show the screenshot in the report
		Reporter.log("<img src=\"D://Selenium//selenium_practice2//screenshot//customtestngreport.png\"/>");
	
		//show the link of the screenshot in the report
		Reporter.log("<a target=\"_blank\" href=\"D://Selenium//selenium_practice2//screenshot//customtestngreport.png\">Screenshot</a>");
		
		
		
		
		
		
	}
	

}
