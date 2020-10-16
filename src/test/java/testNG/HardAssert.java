package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {
	

	
	@Test
	public void testAssertFunctions() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.browserstack.com/");
	String ActualTitle = driver.getTitle();
	String verifyAssertNull=null;
	String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
	Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
	
	Assert.assertEquals(ExpectedTitle, ActualTitle);
	Assert.assertNotEquals(ExpectedTitle, "browserstack");
	Assert.assertTrue(verifyTitleIsPresent);
	Assert.assertFalse(verifyTitleIsChanged);
	Assert.assertNotNull(verifyTitleIsPresent);
	Assert.assertNull(verifyAssertNull);
	}

	

}
