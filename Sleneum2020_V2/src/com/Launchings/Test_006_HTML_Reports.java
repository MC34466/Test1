package com.Launchings;
import com.relevantcodes.extentreports.LogStatus;

public class Test_006_HTML_Reports extends BaseTest2
{
	public static void main(String[] args) 
	{
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test=report.startTest("Test_006_HTML_Reports");
		test.log(LogStatus.INFO, "-----------Started Test_005.log4j-----------");
		
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Opening browser:	"+p.getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		test.log(LogStatus.INFO, "Navigate to url     "+childprop.getProperty("amazonurl"));
		/*Stand Alone Programm
		 * driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		 * driver.findElement(By.xpath("//input[@value='Go']")).click();
		 */
		
		/*PartiallyDynamic
		 * search("searchDropdownBox","Books");
		 * type("twotabsearchtextbox","Harry Potter"); 
		 * find("//input[@value='Go']");
		 */
		
		//FulllyDynamic
		search("Amazondropdown_name","Books");
		test.log(LogStatus.FAIL, "Select Books by locator:      "+orprop.getProperty("Amazondropdown_name"));
	
		type("Amazonsearchtext_name","Harry Potter");
		test.log(LogStatus.INFO, "Type Harry potter bookaname by locator:     "+orprop.getProperty("Amazonsearchtext_name"));
		
		find("Amazonsearchbutton_xpath");
		test.log(LogStatus.ERROR, "click on the search botton by locator:     "+orprop.getProperty("Amazonsearchbutton_xpath"));

		test.log(LogStatus.INFO, "-----------Ended Test_005.log4j-----------");
		
		report.endTest(test);
		report.flush();
	}

	

}
