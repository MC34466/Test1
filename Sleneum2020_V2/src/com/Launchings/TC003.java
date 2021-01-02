package com.Launchings;

public class TC003 extends BaseTest2
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

	}

}
