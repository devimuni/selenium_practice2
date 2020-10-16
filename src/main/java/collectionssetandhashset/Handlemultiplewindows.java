package collectionssetandhashset;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlemultiplewindows {


	@Test
	public void multipleiwndows() throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en.html");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);

		driver.findElement(By.className("login-btn")).click();
		Thread.sleep(6000);
		//driver.findElement(By.id("Username")).sendKeys("12345");



		//driver.findElement(By.xpath("//a[contains(text(),'myteamcards')]")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> I1 = windows.iterator();
		String newhandle = null;
		while(I1.hasNext())
		{

			String childwindow = I1.next();


			if (parentwindow.equals(childwindow))
			{	

				System.out.println(childwindow);
			}
			else 
			{
				System.out.println(childwindow);
				newhandle = childwindow;
				
			}

		}
		driver.switchTo().window(newhandle);
		driver.switchTo().frame("framemain");
		driver.findElement(By.id("Username")).sendKeys("12345");
		driver.switchTo().defaultContent();
		//driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//a[contains(@data-identifier,'Homepage-hero-myteamcards')]")).click();
	
	}

}
