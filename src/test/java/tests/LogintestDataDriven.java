package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilites.Excelutility;
import webpages.Loginpage;

public class LogintestDataDriven extends Baseclass
{

	@Test(dataProvider = "test data")
	public void login(String username, String password) throws InterruptedException
	{
		
		Loginpage lp = new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicklogin();
		boolean logout = lp.checklogoutdisplay();
		
		if(logout==true)
		{
			Assert.assertTrue(true);
			System.out.print("this step executed");
			
		}
		else
		{
			Assert.assertTrue(false);
			
		}
		
	}
	
		
	@DataProvider(name = "test data")
	public Object[][] getdata()
	{
		
		String excelpath= "D:\\Selenium\\selenium_practice2\\src\\test\\java\\testdata\\testdata.xlsx";
		Object data[][] = testdata(excelpath,"sheet1");
		return data;
		
	}
	
	public Object[][] testdata(String excelpath, String sheetname)
	{
		Excelutility excel = new Excelutility(excelpath, sheetname);
		int rowcount = excel.getrowcount();
		int colcount = excel.getcolumncount();
		Object data[][] = new Object[rowcount-1][colcount];
				for(int i=1;i<rowcount;i++ )
				{
					for(int j= 0; j<colcount;j++)
					{
						String celldata = excel.getcelldata(i, j);
						data[i-1][j]= celldata;
					}
				}
		return data;
	}
	
}
