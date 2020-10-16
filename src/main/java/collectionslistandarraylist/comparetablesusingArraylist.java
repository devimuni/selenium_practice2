package collectionslistandarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class comparetablesusingArraylist {

	@Test
	public void orderdatevalidation()
	{


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://howtodoinjava.com/java/date-time/java-parse-string-to-date/");
		driver.manage().window().maximize();
		//List<WebElement>table1 =driver.findElements(By.xpath("//table/tbody/tr[1]/following-sibling::tr"));
		List<WebElement>table1 =driver.findElements(By.xpath("//table/tbody/tr[1]/following-sibling::tr"));
		List<WebElement>table2 =driver.findElements(By.xpath("//table/tbody/tr[2]/following-sibling::tr"));
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		for(WebElement value : table1) 
		{
			//System.out.println("values are   "+ value.getText());
			list1.add(value.getText());


		}

		for(WebElement value2 : table2) 
		{
			//System.out.println("values are   "+ value2.getText());
			list2.add(value2.getText()); 


		}
		System.out.println(list1);
		System.out.println(list2);
		
		//compare two list are equal or not
		boolean isEqual = list1.equals(list2);
		System.out.println(isEqual);
		
		
		//find the difference in the two tables
		list1.removeAll(list2);
        System.out.println(list1);
		
		
		driver.quit();
	}



}




