package basicsanity;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexceldata 
{



	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	@Test
	public void readexcel()
	{

		try 
		{	String path = "D:\\Selenium\\selenium_practice2\\src\\test\\java\\basicsanity\\testdata.xlsx";
			workbook =new XSSFWorkbook(path);
			sheet = workbook.getSheet("sheet1");

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=1; i<rowcount; i++) 
		{
			for (int j=0; j<colcount;j++) 
			{

				String celldata= null;
				celldata = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(celldata);
			}

		}
		/*String row1column0= null;
		row1column0 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(row1column0);

		String row1column1= null;
		row1column1 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(row1column1);

		String row2column0= null;
		row2column0 = sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(row2column0);

		String row2column1= null;
		row2column1 = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println(row2column1);*/
		

	}




}
