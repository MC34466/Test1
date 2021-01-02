package com.Launchings;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) 
	{
		try {
			init();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		launch("chromebrowser");
		navigateurl("iciciurl");
		/*
		 * driver.manage().window().maximize(); String title = driver.getTitle();
		 * System.out.println(title); String url = driver.getCurrentUrl();
		 * System.out.println(url);
		 * 
		 * driver.navigate().back();
		 * 
		 * driver.navigate().forward();
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.close(); driver.quit();
		 */
	}

}
