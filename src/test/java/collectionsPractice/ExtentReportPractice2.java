package collectionsPractice;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportPractice2 {
	
	public static void main(String[] args) throws IOException {
		
		 ExtentReports extentReport = new ExtentReports();
		 ExtentSparkReporter extentSpark = new ExtentSparkReporter("report.html");
		extentReport.attachReporter(extentSpark); 
		
		extentReport.setSystemInfo("Auther", "soumya");
		extentReport.setSystemInfo("Reviewer", "SOUMYA");
		 ExtentTest test1 = extentReport.createTest("Test 1");
		test1.assignAuthor("soumya").assignDevice("Windows 11").pass("This is passed");
		
		 ExtentTest test2 = extentReport.createTest("Test 2");
		test2.assignAuthor("soumya").assignDevice("Windows 11").log(Status.FAIL, "This is Failled");
		
		extentReport.createTest("Test 2").assignAuthor("soumya").assignDevice("Windows 11").skip("This is skipped");
		
		
		extentReport.flush();		
		System.out.println();
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}

}
