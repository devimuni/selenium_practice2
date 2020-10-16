package utilites;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{
	private static ExtentReports extent;
	public static ExtentReports createInstance()
	{
		String filename = getreportname();
		String directory = System.getProperty("user.dir") + "/reports/";
		new File(directory).mkdirs();
		String path=directory + filename;
		
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(path);
		
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setDocumentTitle("Automation Reports");
		htmlreporter.config().setReportName("Automation test result");
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent= new ExtentReports();
		extent.setSystemInfo("Windows10", "Naresh");
		extent.setSystemInfo("Browser","Chrome");
		extent.attachReporter(htmlreporter);
		return extent;
		
		
	}
	
	
	
	public static String getreportname()
	{
		
		Date d = new Date();
		String filename = "AutomationReports" + "_" + d.toString().replace(":", "_")+".html";
		return filename;
	}
	
	
	

}
