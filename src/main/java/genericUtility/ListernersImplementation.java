package genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernersImplementation implements ITestListener{
	
	
	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil= new JavaUtility();
	String dateTimeStamp= jUtil.getCalendarDetails("dd/MM/YYYY-hh-mm-ss");

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName= result.getMethod().getMethodName();
		System.out.println(methodName+" test has been started");
		test= report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		System.out.println(methodName+" test has been successful");
		test.log(Status.PASS, methodName+" Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		System.out.println(methodName+" test has been failed");
		test.log(Status.FAIL, methodName+" Failed");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		System.out.println(methodName+" test has been skipped");
		test.log(Status.FAIL, methodName+" Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("suite execution started");
		ExtentSparkReporter reporter= new ExtentSparkReporter(".\\Extent Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("vtiger application");
		reporter.config().setReportName("execution report");
		reporter.config().setTheme(Theme.DARK);
		
		report= new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Browser", "CHROME");
		report.setSystemInfo("OS", "WINDOWS");
		report.setSystemInfo("Base url", "https://www.localhost");
		report.setSystemInfo("Test Engineer", "Hithaishini");
		
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("suite execution ended");
		report.flush();
		
	}
	
	
	

}
