package collectionslistandarraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drodownsortwithoutwebelements {


	WebDriver driver;

	@Test
	public void dropDownListSortedOrNot() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.ebay.in/");
		Thread.sleep(3000);  
		WebElement element = driver.findElement(By.id("gh-cat"));

		Select se = new Select(element);

		List<String> orginallist= new ArrayList<String>();
		List<String> templist = new ArrayList<String>();

		List<WebElement> options = se.getOptions();

		for(WebElement e: options)
		{


			System.out.println("orginal values are   "+ e.getText());
		}

		Collections.sort(templist);


		if( templist==orginallist)
		{

			System.out.println("Items are Sorted");
		}
		else {
			System.out.println("Items are not Sorted");

		}



	}



}
