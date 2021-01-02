package com.Launchings;
import org.apache.log4j.Logger;

public class Test_005_Log4j extends BaseTest2
{
	private static final Logger log = Logger.getLogger(Test_005_Log4j.class);
	public static void main(String[] args) 
	{
		try {
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("-----------Started Test_005.log4j-----------");
		launch("chromebrowser");
		log.info("Opening browser:	"+p.getProperty("chromebrowser"));
		navigateurl("amazonurl");
		log.info("Navigate to url     "+childprop.getProperty("amazonurl"));
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
		log.info("Select Books by locator:      "+orprop.getProperty("Amazondropdown_name"));
		type("Amazonsearchtext_name","Harry Potter");
		log.info("Type Harry potter bookaname by locator:     "+orprop.getProperty("Amazonsearchtext_name"));
		find("Amazonsearchbutton_xpath");
		log.info("click on the search botton by locator:     "+orprop.getProperty("Amazonsearchbutton_xpath"));
		
		log.info("-----------Ended Test_005.log4j-----------");
	}

	

}
