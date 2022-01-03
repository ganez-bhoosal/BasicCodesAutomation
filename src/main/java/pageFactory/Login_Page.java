package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
WebDriver driver;
	
	@FindBy(name = "uid")
	public WebElement UserID;
	
	@FindBy(name = "password")
	public WebElement Password;
	
	@FindBy(name = "btnLogin")
	public WebElement LOGIN;
	
	
	public Login_Page(WebDriver webDriver) {
		
		this.driver = webDriver;
		PageFactory.initElements(webDriver, this);
			
	}
	
	public void enterUserName(String strUserName) {
		UserID.sendKeys(strUserName);


	}

	public void enterPassword(String strPassword) {
	Password.sendKeys(strPassword);


	}

	public void clickLoginButton() {
		LOGIN.click();


	}

}
