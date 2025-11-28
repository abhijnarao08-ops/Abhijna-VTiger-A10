package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{
	// global variable
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY  hh-mm-ss");
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method started");
		Reporter.log(methodName + " Test method started");  // this is to print the message in emailable.html folder
		
		// to log on the report
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method successfully executed");
		Reporter.log(methodName + " Test method successfully executed");
		
		// logging the status if method is passed
		test.log(Status.PASS, methodName + " test method success");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method failed");
		Reporter.log(methodName + " Test method failed");
		
		// logging the status if method is failed
		test.log(Status.FAIL, methodName + " test method failure");
		
		// logging the info for the test method failed about its THROWABLE
		test.log(Status.INFO, result.getThrowable());
		
		// Taking Screenshot of the WebPage
		
		String screenshotName = methodName + "-" + dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();
		try   // since we are overloading throws exception is not possible, we have to write the code in try and catch block
		{
			String path = sUtil.getWebpageScreenshot(BaseClass.sDriver, screenshotName);     // we are calling a static variable from base class, so call it with class name
			// Attaching screenshot to the report for the failed method
			test.addScreenCaptureFromPath(path);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method skipped");
		Reporter.log(methodName + " Test method skipped");
		
		// logging the status if method is skipped
		test.log(Status.SKIP, methodName + " test method skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method lil success");
		Reporter.log(methodName + " Test method lil success");
		
		// logging the status if method is skipped
		test.log(Status.FAIL, methodName + " test method skipped");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + " Test method failed because of timeout");
		Reporter.log(methodName + " Test method failed because of timeout");
				
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Suite execution started");
		Reporter.log("test method on start");
		
		// configuration of Extent Reports  configuration means where to store the report, name of the document etc.
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\ExtentReport\\report-" + dateTimeStamp + ".html");
		reporter.config().setDocumentTitle("QA Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		// Generate an empty report and add system info
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888");
		reports.setSystemInfo("Base OS", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Abhijna");
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("Suite execution finished");
		Reporter.log("test method on finish");
		//Flushing the generated reports
		reports.flush();
	}
}
