package utilites;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{

	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public Excelutility(String excelpath, String sheetname)
	{
		
		try 
		{
			workbook= new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getrowcount()
	{
		int rowcount =0;
		rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows are  "+  rowcount);
		return rowcount;
	}
	
	public int getcolumncount()
	{
		int colcount = 0 ;
		colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Numberof coulmns are  "+ colcount);
		return colcount;
	}
	
	public String getcelldata (int rownum, int colnum)
	{
		String celldata = null;
		celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		return celldata;
	}
	
	public void main(String[] args)
	{
		getrowcount();
		getcolumncount();
		getcelldata(1,1);
		
		
	}
	
}
