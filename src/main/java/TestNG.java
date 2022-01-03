import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG
{
	static WebDriver driver;
	
	@Test
	public static void test001()
	{
		System.out.println("This is test 001  ");
		//Creating WebDriver instance
				driver = new ChromeDriver();
				//Navigate to web page
				driver.get("https://www.google.com");
				//Maximizing window	
				driver.manage().window().maximize();				
				//Retrieving web page title		
				String title = driver.getTitle();		
				System.out.println("The page title is : " +title);	
				//Putting implicit wait		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Setting up chromeDriver path  ");

		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");

	}

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Closing the Browser Session  ");
		//WebDriver driver = new ChromeDriver();

		driver.quit();

	}	
}



