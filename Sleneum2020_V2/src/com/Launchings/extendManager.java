package com.Launchings;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class extendManager extends BaseTest2
{
	public static ExtentReports reports;
	
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
			report=new ExtentReports(projectPath+"//HtmlReports//htmlreport.html");
			report.loadConfig(new File(projectPath +"//ExtentReportconfig.xml"));
			report.addSystemInfo("Selenium LanguageBinding", "3.141.59").addSystemInfo("environment", parentprop.getProperty("env"));
		}
		return report;
		
	}

}
