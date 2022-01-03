package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	By userName = By.name("uid");
	By Password = By.name("password");
	By loginButton = By.name("btnLogin");

	public LoginPage(WebDriver driver) {
		this.driver = driver;


	}

	public void enterUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);


	}

	public void enterPassword(String strPassword) {
		driver.findElement(Password).sendKeys(strPassword);


	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();


	}


}
