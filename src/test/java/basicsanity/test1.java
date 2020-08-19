package basicsanity;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	
	@Test
	public void launchapplication()
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
			driver.get("https://example.testproject.io/web/");

			//logger.error("testproject application launched");
			System.out.println("Successfully launched in chrome and title is  " + driver.getTitle());
			driver.quit();
			
	}

}
