package xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amamzonorderlistsortedbydate {


	@Test
	public void verifydatesortedornot()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("nareshpatnam@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("nashmuni");
		driver.findElement(By.xpath("//span[@id='auth-signin-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@name='orderFilter']"));
		Select select = new Select(ele);
		select.selectByValue("year-2018");
		List<WebElement>list = driver.findElements(By.xpath("//span[contains(text(),'Order placed')]/following::span[1]"));
		/*Iterator<WebElement> itr1 = list.iterator();

		while(itr1.hasNext())
		{
			WebElement dateelement =itr1.next();
			System.out.println("all the dates:    "+dateelement.getText());

		}*/

		ArrayList<String> listValues = new ArrayList<String>();

		for(WebElement value : list) {
			
			listValues.add(value.getText());
			


		}
			

		boolean sortedOrNot = sortedOrNot(listValues);
		Assert.assertEquals(true, sortedOrNot);

		//driver.close();

	}
	public boolean sortedOrNot(ArrayList<String> listValues1) {
		System.out.println("number of values "+ listValues1.size());
		for(int i=0; i<listValues1.size()-1;i++) {

			System.out.println(listValues1.get(i));
			System.out.println(listValues1.get(i+1));
			int temp = listValues1.get(i).compareTo(listValues1.get(i+1));
			System.out.println(temp);
			if(temp<1) {
				System.out.println("i value"+i);
				return false;
			} 
		}
		return true;

	}

}








