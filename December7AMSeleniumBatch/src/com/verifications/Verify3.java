package com.verifications;

import com.aventstack.extentreports.Status;
import com.launchings.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verify3");
		
		launcher("chromebrowser");
		test.log(Status.INFO, "Launching Browser");
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to application");
		
		String expectedLink = "customer Service";
		
		if(!isLinksEqual(expectedLink))
			reportFailure("Both links are not equal...");
			//System.out.println("Both links are not equal...");
		else
			reportSuccess("Both links are equal...");
			//System.out.println("Both links are equal...");

		report.flush();
	}

	
	

}
