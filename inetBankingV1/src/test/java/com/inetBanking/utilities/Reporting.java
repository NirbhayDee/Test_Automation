package com.inetBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter 
{
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger; 

	public void onTestStart(ITestResult result) {
		
		String timeStamp = new SimpleDateFormat ("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report"+timeStamp+".html";
		htmlReporter = new ExtentHtmlReporter("/home/nirbhay/eclipse-workspace/inetBankingV1/test-output/"+repName);
		htmlReporter.loadXMLConfig("/home/nirbhay/eclipse-workspace/inetBankingV1/extend-config.xml");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname","LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Tester Name", "Nirbhay");
		extent.setSystemInfo("Browser","Chrome");
		
		htmlReporter  = new ExtentHtmlReporter("/home/nirbhay/eclipse-workspace/inetBankingV1/test-output/MyReport.html");
		
		htmlReporter.config().setDocumentTitle("Automation Report");//  Title of  the report
		htmlReporter.config().setReportName("Functional Report ");//  Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
	}

	public void onTestSuccess(ITestResult result) {
		logger = extent.createTest(result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		
		
	}

	public void onTestFailure(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
		String screeenshotPath=System.getProperty("/home/nirbhay/eclipse-workspace/inetBankingV1/Screenshots"+result.getName()+".png");
		
		File f = new File (screeenshotPath);
		
		if (f.exists()) {
			try {
				logger.fail("Screeensshot is below:" + logger.addScreenCaptureFromPath(screeenshotPath));
			}
			
			catch (IOException e) {
				e.printStackTrace();
				
			}
		}
			
		
	}

	public void onTestSkipped(ITestResult result) {
		
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
	
		extent.flush();
		
	}

}
