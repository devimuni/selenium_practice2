package basicsanity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	
	WebDriver ldriver;
	
	public loginpage (WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id= "name")
	WebElement txtusername;
	
	@FindBy(id = "password")
	WebElement txtpassword;
	
	@FindBy(id = "login")
	WebElement btnlogin;
	
	
	@FindBy(id="logout")
	WebElement logout;
	
	public void setusername(String uname)
	{
		txtusername.sendKeys(uname);
		
	}
	public void setpassword(String pword)
	{
		
		txtpassword.sendKeys(pword);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	public boolean checklogoutdisplay()
	{
		
		boolean logoutbutton =logout.isDisplayed();
		return logoutbutton;
		
	}
}
