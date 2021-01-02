package Selenium_Webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.Launchings.BaseTest2;

public class Selfy2 extends BaseTest2
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
		
		List<WebElement> links = driver.findElements(By.linkText("MaheshBabu"));
		
		if(links.size()==0)
		{
			File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try 
			{
				FileHandler.copy(scrnshot,new File( "C:\\Users\\dell\\Desktop\\Screenshot\\Selft2.jpeg"));
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
