import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin
{
	static WebDriver driver;
	
	@Test
	public static void test002()
	{
		System.out.println("This is test 002  ");
		//Creating WebDriver instance
				driver = new ChromeDriver();
				//Navigate to web page
				driver.get("https://phptravels.org/index.php?rp=/login");
				//Maximizing window	
				driver.manage().window().maximize();				
				//Retrieving web page title		
				String title = driver.getTitle();		
				System.out.println("The page title is : " +title);	
				//Putting implicit wait		
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
				
				driver.findElement(By.name("username")).sendKeys("Ganesh@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Password123");
				//driver.findElement(By.id("login")).click();
			//	driver.findElement(By.linkText("Register")).click();
			//	driver.findElement(By.linkText("Forgot Password?")).click();


				
				
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

		//driver.quit();

	}	

}


