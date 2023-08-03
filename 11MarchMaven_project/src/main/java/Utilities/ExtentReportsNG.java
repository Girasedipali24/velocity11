package Utilities;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsNG {
	
	static ExtentReports extents;
	
	public static ExtentReports getReportObject() {
		
		String TimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String Name = "ExtentReport---"+TimeStamp;
		
		String Path =System.getProperty("user.dir")+"//Reports//"+Name+" "+".html";
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(Path);
		reporter.config().setReportName("11March Framework extent report");
		reporter.config().setDocumentTitle("11March Framework execution result");
		extents =new ExtentReports();
		extents.attachReporter(reporter);
		extents.setSystemInfo("QA Automation engineer", "Dipali Girase");
		extents.setSystemInfo("Suite Name", "Regression/Smoke");
		
		return extents;
	
	}

}
