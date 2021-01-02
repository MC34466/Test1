package com.Launchings;

public class Test_004 extends BaseTest2
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
		type("Amazonsearchtext_name","Harry Potter");
		find("Amazonsearchbutton_xpath");
	}

	

}
