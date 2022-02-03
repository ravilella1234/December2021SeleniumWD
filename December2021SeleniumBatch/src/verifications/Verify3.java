package verifications;

import com.aventstack.extentreports.Status;

import launchings.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files.....");
		
		launch("chromebrowser");
		test.log(Status.INFO, "Launching the Browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to Url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		String expectedLink = "Customer Service";
		if(!isLinksEqual(expectedLink))
			reportFailure("Both Links are not equal...");
		else
			reportSuccess("Both Links are equal...");
		
		rep.flush();
	}

}
