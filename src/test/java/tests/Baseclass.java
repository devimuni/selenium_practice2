package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	
	public String url= "http://www.demo.guru99.com/V4/";
	public static  WebDriver driver;
	@Parameters("browsername")
	@BeforeClass
	public void setup(String browsername)
	{
		
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		
		}
		
		else if (browsername.equals("ie")) 
		{

			WebDriverManager.iedriver().setup();	
			driver= new InternetExplorerDriver();
			
		}
		else if (browsername.equals("firefox")) 
		{

			WebDriverManager.firefoxdriver().setup();
			driver=  new FirefoxDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}


}
