package com.launchings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eample1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[16]/td[4]")).getText();
		System.out.println(price);
		
		String p = driver.findElement(By.xpath("//a[contains(text(),'Dharani Finance')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(p);
	}

}
