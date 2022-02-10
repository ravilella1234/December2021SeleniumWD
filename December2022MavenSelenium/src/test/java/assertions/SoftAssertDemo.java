package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.i";
		
		SoftAssert s = new SoftAssert();
		//s.assertEquals(actualTitle, expectedTitle);
		s.assertTrue(actualTitle.equals(expectedTitle), "Both titles are not equal...");
		
		s.assertTrue(false, "err1");
		
		s.assertTrue(false, "err2");
		
		s.assertTrue(true, "err3");
		
		s.assertTrue(false, "err4");
		
		driver.findElement(By.linkText("Customer Service")).click();
		
		System.out.println("Thank You");
		
		s.assertAll();
	}

}
