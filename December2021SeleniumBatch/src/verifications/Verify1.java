package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//String actualValue = driver.findElement(By.linkText("Customer Service")).getText();
		String actualValue = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedValue = "Customer";
		
		System.out.println("Actual links :" + actualValue);
		System.out.println("Expected links :" + expectedValue);
		
		//if(actualValue.equals(expectedValue))
		//if(actualValue.equalsIgnoreCase(expectedValue))
		if(actualValue.contains(expectedValue))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");
	}

}
