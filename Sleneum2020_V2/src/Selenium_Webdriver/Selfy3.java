package Selenium_Webdriver;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.Launchings.BaseTest2;

public class Selfy3 extends BaseTest2
{

	public static void main(String[] args) throws Exception
	{
		init();
		launch("chromebrowser");
		navigateurl("googleurl");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		 for(int i=0;i<links.size();i++)
		 	{
			 if (!links.get(i).getText().isEmpty())
			 {
				String linkName = links.get(i).getText();
				driver.findElement(By.linkText(linkName)).click();
				File scrnshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrnshot,new File( "C:\\Users\\dell\\Desktop\\Screenshot\\"+linkName+".jpeg"));
				driver.navigate().back();
				links = driver.findElements(By.tagName("a"));
			 }
		 	}
		 
	}


}
