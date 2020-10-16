package basicsanity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_images {
	
	@Test
	public void images()
	{
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"product-item\"]//img"));
	    System.out.println(elements.size());
	    WebElement last_element = elements.get(elements.size()-4);
		
		last_element.click();
		driver.navigate().back();
		driver.navigate().to ("https://demo.nopcommerce.com/build-your-own-computer");
		
	}
	
	
	

}
