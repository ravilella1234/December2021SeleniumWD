package switchings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='credit card'][@class='lazy loaded']"))).isDisplayed())
		{
			driver.findElement(By.xpath("//div[@class='banner-slider i-home-banner desktop slick-initialized slick-slider slick-dotted']/button[text()='Next']")).click();
		}
		
		driver.findElement(By.xpath("//img[@alt='credit card'][@class='lazy loaded']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		List<String> nwinds = new ArrayList<String>(windows);
		
		for(String win :nwinds)
		{
			System.out.println(win);
		}
		
		driver.switchTo().window(nwinds.get(1));
		System.out.println(driver.getTitle());

	}

}

