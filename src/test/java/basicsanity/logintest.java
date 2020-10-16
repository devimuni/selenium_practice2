package basicsanity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	WebDriver driver;
	@Test
	public  void login()
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.id("name")).sendKeys("naresh");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		String welscreen = driver.findElement(By.id("greetings")).getText();
		System.out.println("title2 is " + welscreen);
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertEquals(welscreen, "Hello naresh, let's complete the test ");
		try {
			Assert.assertEquals(welscreen, "Hello naresh, let's complete the test ");
		}
		finally {
			Select country=new Select (driver.findElement(By.xpath("//*[@id=\"country\"]")));
			country.selectByValue("IN");
			//softAssert.assertAll();

			//driver.quit();
		}
	}

}
