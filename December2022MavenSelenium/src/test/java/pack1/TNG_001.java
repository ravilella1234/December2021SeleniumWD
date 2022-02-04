package pack1;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest
{
	  
  @BeforeMethod
  public void stratProcess() throws Exception 
  {
	  System.out.println("Before Method");
	  	init();
		test = rep.createTest("TC_004");
		test.log(Status.INFO, "Init the properties files.....");
		
		launch("chromebrowser");
		test.log(Status.PASS, "Launching the Browser :-" + p.getProperty("chromebrowser"));
		 
		navigateUrl("amazonurl");
		test.log(Status.FAIL, "Navigated to Url : " + childProp.getProperty("amazonurl"));
  }

  @Test
  public void amazon() 
  {
	  System.out.println("Amazon Test");
	    selectOption("amazondropdown_id","Books");
		test.log(Status.PASS, "Selected the option Books By usong the locator :-" + orProp.getProperty("amazondropdown_id"));
		
		typeText("amazontextbox_name","Harry Potter");
		test.log(Status.PASS, "Entered the text Hary potter by using locator :-" + orProp.getProperty("amazontextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked the element by usong the locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
  }
  
  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("After Method");
	  rep.flush();
	  driver.quit();
  }

}
