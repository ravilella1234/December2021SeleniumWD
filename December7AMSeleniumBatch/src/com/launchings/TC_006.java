package com.launchings;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{
	
	public static void main(String[] args) throws Exception
	{
		
		init();
		test = report.createTest("TC_006");
		test.log(Status.INFO, "Init the properties files....");
		
		launcher("chromebrowser");
		test.log(Status.INFO, "Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selected option Books by using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.PASS, "Entered the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked the element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));

		report.flush();
			
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	

}
