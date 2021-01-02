package Selenium_Webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Launchings.BaseTest2;

public class Selfy1 extends BaseTest2
{

	public static void main(String[] args) 
	{
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		launch("chromebrowser");
		navigateurl("amazonurl");
		
		File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(scrnshot, new File("C:\\Users\\dell\\Desktop\\Screenshot\\Selfie1.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
