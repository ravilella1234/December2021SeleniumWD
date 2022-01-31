package com.webdriverscreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sely2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String link = driver.findElement(By.linkText("Customer Service")).getText();
		System.out.println(link);
		
		System.out.println("-----------------------------");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		System.out.println("-----------------------------");

		List<WebElement> links1 = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		for(int j=0;j<links1.size();j++)
		{
			System.out.println(links1.get(j).getText());
		}
	}

}
