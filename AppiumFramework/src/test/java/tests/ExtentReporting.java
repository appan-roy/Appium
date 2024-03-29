package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporting {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetup() {

		htmlReporter = new ExtentHtmlReporter("./Reports/extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	
	@AfterSuite
	public void reportTeardown() {
		
		extent.flush();
		
	}
	
}
