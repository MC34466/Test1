package com.Launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:/Users/dell/Desktop/Nov_Sel_Drivers/chromedriver.exe")
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://amazon.in");
//		
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver1.get("http://flipkart.in");
		
		//Polymorphism concept
		WebDriver driver;
		//driver = new ChromeDriver();
		//driver.get("http://amazon.in");
		
		driver = new FirefoxDriver();
		driver.get("http://flipkart.in");
	}

}
