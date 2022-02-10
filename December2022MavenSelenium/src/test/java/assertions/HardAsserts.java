package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAsserts 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink = "Customer Services";
		
		/*
		 * if(actualLink.equals(expectedLink))
		 * System.out.println("Both links are equal"); else
		 * System.out.println("Both links are not equal...");
		 */
		
		//Assert.assertEquals(actualLink, expectedLink);
		Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
		
		driver.findElement(By.linkText("Customer Service")).click();

	}

}
