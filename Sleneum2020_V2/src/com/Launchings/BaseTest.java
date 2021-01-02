package com.Launchings;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties p;
	
	public static void init() throws Exception
	{
		FileInputStream fis = new FileInputStream(projectPath+"/data.properties");
		p = new Properties();
		p.load(fis);
	}
	public static void launch(String browser)
	{
		//Stand alone 
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://amazon.in");
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver1.get("http://flipkart.in");
		
		
		//Partially Dynamic: TC_001
//		if(browser.equals("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox")) 
//		{
//			driver = new FirefoxDriver();
//		}
		
		
		//Fully Dynamic: TC_002
		if(p.getProperty(browser).equals("chrome"))
		{
			driver = new ChromeDriver();
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateurl(String url)
	{
		//Partially Dynamic: TC_001
//		driver.get(url);
		
		//Fully Dynamic: TC_002
		driver.get(p.getProperty(url));
	}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
