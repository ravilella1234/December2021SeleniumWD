package com.launchings;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"\\data.properties");
		p = new Properties();
		p.load(fis);
				
		fis = new FileInputStream(projectPath+"\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath+"\\"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("amazonurl");
		System.out.println(url);
	}
	
	public static void launcher(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			ChromeOptions option  = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\ravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 10");
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");
			//certificate errors handling
			option.addArguments("--ignore-certificate-errors-spki-list");
			//Proxy ip settings
			option.addArguments("--proxy-server=https://192.168.10.1:9090");
			
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("Jan2022FF");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			//Notifiations
			profile.setPreference("dom.webnotifications.enabled", false);
			
			//Certificate Errors
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			//How to work with Proxy Settings
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("netwirk.proxy.socks", "192.168,10.1");
			profile.setPreference("network.proxy.socks_port", 1744);
			
			driver = new FirefoxDriver(option);
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}

}
