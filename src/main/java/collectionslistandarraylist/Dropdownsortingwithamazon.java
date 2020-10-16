package collectionslistandarraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsortingwithamazon {
	
	WebDriver driver;
	
	@Test
	   public void dropDownListSortedOrNot() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
	      driver.get("https://www.amazon.in/");
	      Thread.sleep(3000);  
	      WebElement element = driver.findElement(By.id("searchDropdownBox"));
	      element.click();
	      
	      List<WebElement> listvalues = element.findElements(By.tagName("option"));
	      ArrayList<String> arrayValues = new ArrayList<String>();
	      
	      for(WebElement value : listvalues) {
	         System.out.println("values are   "+ value.getText());
	        arrayValues.add(value.getText());
	       // Collections.sort(arrayValues);
	        
	      }
	      
	      boolean sortedOrNot = sortedOrNot(arrayValues);
	      Assert.assertEquals(true, sortedOrNot);

	      //driver.close();

	   }
	   public boolean sortedOrNot(ArrayList<String> arrayValues1) {
	      System.out.println("number of values "+ arrayValues1.size());
	      for(int i=0; i<arrayValues1.size()-1;i++) {
	    	  
	    	  System.out.println(arrayValues1.get(i));
	    	  System.out.println(arrayValues1.get(i+1));
	         int temp = arrayValues1.get(i).compareTo(arrayValues1.get(i+1));
	         System.out.println(temp);
	         if(temp>1) {
	            System.out.println("i value"+i);
	            return false;
	         } 
	      }
	      return true;
	      
	   }


}
