package basicsanity;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicsanity {


	public static Logger logger = LogManager.getLogger(Basicsanity.class);

	public WebDriver driver;

	@Parameters("browsername")
	@Test
	public void launchapplication(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://example.testproject.io/web/");

			//logger.error("testproject application launched");
			System.out.println("Successfully launched in chrome and title is  " + driver.getTitle());
			driver.quit();
		}
		else if(browsername.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();	
			driver= new InternetExplorerDriver();
			driver.get("https://example.testproject.io/web/");

			System.out.println("Successfully launched in IE and title is   " +  driver.getTitle());
			driver.quit();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://example.testproject.io/web/");

			System.out.println("Successfully launched in firefox and title is   " + driver.getTitle());
			driver.quit();

		}
		/*else if(browsername.equalsIgnoreCase("HTML"))
		{

			driver = new HtmlUnitDriver();

			driver.get("https://example.testproject.io/web/");

			System.out.println("Successfully launched in headless browser and title is   " + driver.getTitle());
			driver.quit();

		}*/
	}


}

