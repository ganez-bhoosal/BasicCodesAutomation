import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {

		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		//Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
		//Navigate to web page
		driver.get("https://www.google.com");
		//Maximizing window	
		driver.manage().window().maximize();				
		//Retrieving web page title		
		String title = driver.getTitle();		
		System.out.println("The page title is : " +title);	
		//Putting implicit wait		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 		//Closing browser session		
		driver.quit();
		
	}

}
