package navaccessories.com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ReportConfig implements ITestListener {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	
	@Override
	public void onTestStart(ITestResult result) {
		
		String timeStamp = new SimpleDateFormat ("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName = "Test-Report"+timeStamp+".html";
		htmlReporter = new ExtentHtmlReporter("/home/nirbhay/workspace1/navaccessories.com/test-output/"+repName);
		htmlReporter.loadXMLConfig("/home/nirbhay/workspace1/navaccessories.com/extend-config.xml");
		
		extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("Hostname","LocalHost");
		extent.setSystemInfo("OS","ubuntu 16.04");
		extent.setSystemInfo("Tester Name", "Nirbhay");
		extent.setSystemInfo("Browser","Chrome");
		
		htmlReporter  = new ExtentHtmlReporter("/home/nirbhay/workspace1/navaccessories.com/test-output/MyReport.html");
		
		htmlReporter.config().setDocumentTitle("Automation Report");//  Title of  the report
		htmlReporter.config().setReportName("Functional Report ");//  Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger = extent.createTest(result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		logger = extent.createTest(result.getName());
		
		logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
		
		String screeenshotPath=System.getProperty("/home/nirbhay/workspace1/navaccessories.com/Screenshots"+result.getName()+".png");
	
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

	@Override
	public void onTestSkipped(ITestResult result) {
		logger=extent.createTest(result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
}
