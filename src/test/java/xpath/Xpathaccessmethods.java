package xpath;



import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathaccessmethods {
	@Test
	public void accessmethods()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


		//Access 1:find self tag
		WebElement self = driver.findElement(By.xpath("//*[contains(text(),'Infosys')]/self::a"));
		System.out.println("access1 self tag:    "+self.getText());

		//Access 2:find parent tag

		WebElement parent = driver.findElement(By.xpath("//*[contains(text(),'Infosys')]/parent::td"));
		System.out.println("access1 parent tag:    "+parent.getText());

		//Access 3: ancestor tag
		WebElement ancestor = driver.findElement(By.xpath("//*[contains(text(),'Infosys')]/ancestor::tr"));
		System.out.println("access3 ancestor tag:    "+ancestor.getText());

		//Access 4: preceding-sibling tag


		List<WebElement>precedingeles = driver.findElements(By.xpath("//*[contains(text(),'Infosys')]/ancestor::tr/preceding-sibling::tr"));
		Iterator<WebElement> itr1 = precedingeles .iterator();

		while(itr1.hasNext())
		{
			WebElement preelement =itr1.next();
			System.out.println("access4 preceding-sibling tag:    "+preelement.getText());

		}

		//Access5: following-sibling tag
		List<WebElement>followingeles = driver.findElements(By.xpath("//*[contains(text(),'Infosys')]/ancestor::tr/following-sibling::tr"));
		Iterator<WebElement> itr2 = followingeles.iterator();

		while(itr2.hasNext())
		{
			WebElement followelement =itr2.next();
			System.out.println("access5 following-sibling tag:    "+followelement.getText());

		}
		//Access 6: child tag


		List<WebElement>childeles = driver.findElements(By.xpath("//*[contains(text(),'Infosys')]/ancestor::tr/child::td"));
		Iterator<WebElement> itr3 = childeles.iterator();

		while(itr3.hasNext())
		{
			WebElement childelement =itr3.next();
			System.out.println("access6 child tag:    "+childelement.getText());

		}

		//Access7: descendant

		List<WebElement>deseles = driver.findElements(By.xpath("//*[contains(text(),'Infosys')]/ancestor::tr/descendant::td"));
		Iterator<WebElement> itr4 = deseles.iterator();

		while(itr4.hasNext())
		{
			WebElement deselement =itr4.next();
			System.out.println("access7 descendant tag:    "+deselement.getText());

		}

		//Access8: preceding

		List<WebElement>preeles = driver.findElements(By.xpath("//*[contains(text(),'Birlasoft')]/ancestor::tr/preceding::td"));
		Iterator<WebElement> itr5 = preeles.iterator();

		while(itr5.hasNext())
		{
			WebElement preelement =itr5.next();
			System.out.println("access8 preceding tag:    "+preelement.getText());

		}


	}


}
