package pombase;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pomresources.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener{
	ExtentTest test;
	
	ExtentReports extent = ExtentReporterNG.getReportObject();
	
	public void onTetstStart(ITestResult result) {
		
		extent.createTest(result.getMethod().getMethodName());
		
	}
		
	
		
		
	
	
	public void onTestFailure(ITestResult result) {
		
		
	
		
		
	}
	
	

}
