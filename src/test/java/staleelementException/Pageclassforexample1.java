package staleelementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclassforexample1 {
	
	
	Pageclassforexample1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//a[.='FEEDBACK']")
	private WebElement Feedbackbutton;
	
	@FindBy(name="downloadInvoice")
	private WebElement downloadbutton;
	
	public void feebback()
	{
		
		Feedbackbutton.click();
		
	}
	
	public void download()
	{
		
		downloadbutton.click();
	}
	
	
	
	

}
