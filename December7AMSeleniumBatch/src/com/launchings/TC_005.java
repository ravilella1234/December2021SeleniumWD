package com.launchings;

import org.apache.log4j.Logger;

public class TC_005 extends BaseTest
{
	private static final Logger log =  Logger.getLogger(TC_005.class);
	
	public static void main(String[] args) throws Exception
	{
		
		init();
		log.info("Init the properties files....");
		
		launcher("chromebrowser");
		log.info("Opened the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selected option Books by using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Entered the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
			
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	

}
