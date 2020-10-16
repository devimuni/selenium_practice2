package utilites;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import tests.Baseclass;




public class Listeners implements ITestListener
{
	
	private static ExtentReports extent = ExtentReport.createInstance();
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();	
	
	
	public void onTestStart(ITestResult result) {
		ExtentTest test = extent.createTest(result.getTestClass().getName() + "::" + 
												result.getMethod().getMethodName());
		extentTest.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Successful</b>" ;
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		extentTest.get().log(Status.PASS, m);
		
	}

	public void onTestFailure(ITestResult result) {
		
		String methodName= result.getMethod().getMethodName();
		String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());	
		extentTest.get().fail("<details><summary><b><font color=red>Exception Occured, click to see details:"                                                            
				 + "</font></b></summary>" + exceptionMessage.replaceAll(",","<br>") + "</details> \n");
		
		WebDriver driver = ((Baseclass)result.getInstance()).driver;
		String path= takescreenshot(driver,result.getMethod().getMethodName());
		try {
			extentTest.get().fail("<b><font color=red>" + "Screenshot of failure" + "</font></b>" ,
					MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		} catch (IOException e) {
			extentTest.get().fail("Test failed,cannot attach screenshot");
		}
		
		String logText = "<b>Test Method " + methodName + " Failed</b>" ;
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		extentTest.get().log(Status.FAIL, m);
		
	}

	public void onTestSkipped(ITestResult result) {
		String logText = "<b>Test Method " + result.getMethod().getMethodName() + " Skipped</b>" ;
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		extentTest.get().log(Status.SKIP, m);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		if (extent!=null) {
			extent.flush();
		}
	}
	
	
	
	
	
	
	
	public String takescreenshot(WebDriver driver,String methodname)
	{
		
		String fileName= getscreenshot(methodname);
		String directory = System.getProperty("user.dir") + "/screenshot/";
		new File(directory).mkdirs();
		String path=directory + fileName;
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
	}
	
	public static String getscreenshot(String methodname)
	{
		Date d= new Date();
		String filename = methodname + "_" + d.toString().replace(":", "_") + ".png";
		return filename;
	
	}




}
