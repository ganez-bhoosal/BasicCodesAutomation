import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import pageFactory.Login_Page;

public class CrossBrowserTest {

	WebDriver driver;

	
	
	@BeforeTest
	@Parameters("browserName")
	public void beforeTest(String browserName)
	{
		System.out.println("Setting up chromeDriver path  ");

	//	String browserName = "chrome";


		if(browserName.equals("chrome")) {

			//Setting the driver path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();


		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver = new FirefoxDriver();


		}

	
		driver.get("http://demo.guru99.com/");

		//driver.get("https://google.com");	
	}


	@Test
	
	public void test1() {
		String strTitle = driver.getTitle();
		System.out.println("Browser Title " + strTitle);
	}
	public void LoginTest01() throws InterruptedException {

		//LoginPage loginPage = new LoginPage(driver);
		Login_Page loginPage = new Login_Page(driver);

		// to validated if the element (UserID)  is displayed or not
		//Assert.assertEquals(loginPage.UserID.isDisplayed(), true,  "UserID not displayed"); 

		//Assert.assertEquals(loginPage.Password.isDisplayed(), true, "password field is not displayed");  


		// SOFT ASSERTION - proceeds further even if the condition is failed i.e all the steps will be checked, has to be defined

		SoftAssert softAssert = new SoftAssert();
		AssertJUnit.assertEquals(loginPage.LOGIN.isEnabled(),true); 
		softAssert.assertAll();  // mandatory has to be written for softAssertion at the end of you assertion

		if(loginPage.LOGIN.isEnabled()) {

			Reporter.log("Login is Enabled");

		}
		else {
			Reporter.log("Login is not Enabled");
		}

		//Assert.assertTrue(loginPage.UserID.isDisplayed());          // shortest way to find if the condition is passed or not (HARD ASSERTION - does not proceed further if the condition is failed)



		loginPage.enterUserName("Ganesh");
		loginPage.enterPassword("Alabama");
		loginPage.clickLoginButton();
		String alertText = driver.switchTo().alert().getText();				
		// it captures the error message given by the application
		System.out.println(alertText);

		//driver.switchTo().alert().accept();
		// it closes the alert messages

		driver.switchTo().alert().dismiss();
		// it dismisses the alert message

	
		Thread.sleep(2000);	
		
	}
	
	@AfterTest 
	public void afterTest () {
		driver.quit();
	}

}
