package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Usingbasicattributeswihtoutxpath 
{

	
	WebDriver driver;
	@Test
	public void samplepage()
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		//By.id
		String id = driver.findElement(By.id("identifierId")).getAttribute("id");
		System.out.println("atteribute of the ID is   " + id);
		
		//By.name
		String name = driver.findElement(By.name("identifier")).getAttribute("name");
		System.out.println("atteribute of the name is   " + name);
		
		
		//By.className
		String classname = driver.findElement(By.className("VfPpkd-RLmnJb")).getAttribute("class");
		System.out.println("atteribute of the class is   " + classname);
		
		
		
		//By.linkText
		String link= driver.findElement(By.linkText("Learn more")).getText();
		System.out.println("link name is   "+ link);
		
		//By.partialLinkText
		String plink= driver.findElement(By.partialLinkText("Learn")).getText();
		System.out.println("link name is which is matching with partila link learn is   "+ plink);
		
		
		//By.tagName
		
		String tagname = driver.findElement(By.tagName("input")).getAttribute("tagName");
		System.out.println("tagName is:   "+ tagname);
		
		
		
		
	}
	
	
	
	
	
	
	
}
