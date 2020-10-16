package staleelementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclassforexample2 
{

	@FindBy(xpath = "//input[@id='bmwcheck']")
	WebElement selctcheckbox;
	
	
	
	Pageclassforexample2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void checkbox()
	{
		
		selctcheckbox.click();
	}
	
	
	
	
}
