package collectionslistandarraylist;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSortedorNot {
	WebDriver driver;
		
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
	      
	      ArrayList<String> listValues = new ArrayList<String>();
	      
	      for(WebElement value : dropDownvalues) {
	         System.out.println("values are   "+ value.getText());
	        listValues.add(value.getText());
	        
	        
	      }
	      
	      boolean sortedOrNot = sortedOrNot(listValues);
	      Assert.assertEquals(true, sortedOrNot);

	      //driver.close();

	   }
	   public boolean sortedOrNot(ArrayList<String> listValues1) {
	      System.out.println("number of values "+ listValues1.size());
	      for(int i=0; i<listValues1.size();i++) {
	    	  
	    	  System.out.println(listValues1.get(i));
	    	  System.out.println(listValues1.get(i+1));
	         int temp = listValues1.get(i).compareTo(listValues1.get(i+1));
	         System.out.println(temp);
	         if(temp>1) {
	            System.out.println("i value"+i);
	            return false;
	         } 
	      }
	      return true;
	      
	   }

	
	
	
}
