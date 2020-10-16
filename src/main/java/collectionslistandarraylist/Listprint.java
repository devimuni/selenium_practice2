package collectionslistandarraylist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listprint {
	
	@Test
	   public void dropDownListSortedOrNot() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
	      driver.get("http://www.ebay.in/");
	      Thread.sleep(3000);  
	      WebElement element = driver.findElement(By.id("gh-cat"));
	      element.click();
	      //Select se = new Select(element);
	      //List<WebElement> dropDownvalues = se.getOptions();
	      List<WebElement> dropDownvalues = element.findElements(By.tagName("option"));
	      System.out.println(dropDownvalues.toString());
	}
	

}
