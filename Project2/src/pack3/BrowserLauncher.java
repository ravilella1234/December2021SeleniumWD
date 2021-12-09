package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\Desktop\\July 6_30 AM Batch Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	}

}
