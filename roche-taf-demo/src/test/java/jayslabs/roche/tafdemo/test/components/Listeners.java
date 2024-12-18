package jayslabs.roche.tafdemo.test.components;

import java.io.IOException;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import jayslabs.roche.tafdemo.util.ExtentReportNG;

public class Listeners extends BaseTest implements ITestListener{

	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); //Thread safe
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		test.log(Status.PASS, "Test Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		//line below should be implemented in Listeners
		LogEntries entries = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = entries.getAll();
		
		//below line should instead be sent to log4j
		String errprint = "";
		logs.stream().forEach(log -> errprint.concat("\n" + log.getMessage()));

		extentTest.get().fail("Throwable info: " + result.getThrowable() + 
				"\n\nSelenium logs:" + errprint);

		
		
		try {
			driver = (WebDriver) result.getTestClass()
					.getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		String fpath="";
		try {
			fpath = takeScreenshot(result.getTestName(), driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		extentTest.get().addScreenCaptureFromPath(fpath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		test.log(Status.SKIP, "Test Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		extentTest.get().fail(result.getThrowable());
//
//		try {
//			driver = (WebDriver) result.getTestClass()
//					.getRealClass().getField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//			e.printStackTrace();
//		}
//		
//		String fpath="";
//		try {
//			fpath = takeScreenshot(result.getTestName(), driver);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		extentTest.get().addScreenCaptureFromPath(fpath);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
//		extentTest.get().fail(result.getThrowable());
//
//		try {
//			driver = (WebDriver) result.getTestClass()
//					.getRealClass().getField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//			e.printStackTrace();
//		}
//		
//		String fpath="";
//		try {
//			fpath = takeScreenshot(result.getTestName(), driver);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		extentTest.get().addScreenCaptureFromPath(fpath);
	}

	@Override
	public void onStart(ITestContext context) {
//		System.out.println("initializing driver from onStart()");
//		initializeDriver();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
//		tearDown();
	}

}
