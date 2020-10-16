package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilites.Excelutility;
import webpages.Guruloginpage;
import webpages.Loginpage;



public class Logingurusite extends Baseclass

{
	
	
	Alert alert;
	@Test(dataProvider = "test data")
	public  void loginTest(String username, String password) throws InterruptedException
	{
		
		//driver.get(baseURL);
		Guruloginpage lp = new Guruloginpage(driver);
		lp.setusername(username);
		
		lp.setpassword(password);
		
		
		lp.clicksubmit();
		
		
		if(isAlertPresent()==true)
		{
			Thread.sleep(3000);
			
			System.out.println(alert.getText());
			alert.accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			System.out.println("Login failed");
			
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("Login Pass");
			
		}
		
		
		
	}
	public boolean isAlertPresent() throws InterruptedException
	{
		try
		{
		Thread.sleep(3000);	
		alert = driver.switchTo().alert();
		return true;
		}
		catch (NoAlertPresentException e)
		{
		return false;	
		}
			
	}
	
	@DataProvider(name = "test data")
	public Object[][] getdata() {
		//String excelPath = "D:\\Selenium\\gurubankingV1\\src\\test\\java\\com\\gurubanking\\testdata\\testdata.xlsx";
		String excelPath = System.getProperty("user.dir")+ "\\src\\test\\java\\testdata\\testdata.xlsx";
		
		Object data[][] = testData(excelPath,"sheet1");

		return data;

	}



	public  Object[][] testData(String excelPath, String sheetName) {

		Excelutility excel = new Excelutility(excelPath, sheetName);
		int rowCount = excel.getrowcount();
		int colCount = excel.getcolumncount();

		Object data [][] = new Object[rowCount-1][colCount];	
		for(int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount;j++) {

				String cellData = excel.getcelldata(i, j);

				//System.out.print(cellData +"   ");

				data[i-1][j] = cellData;

			}
			//System.out.println();
		}
		return data;
	}


}
