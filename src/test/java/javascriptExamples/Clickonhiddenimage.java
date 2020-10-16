package javascriptExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickonhiddenimage {
	
	
	@Test
	public void hiddenimg()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/06/visibile-and-hidden-webelements.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"hide\"]")).click();
		
		
	}
	
	
	
	
	
	
	
	

}
