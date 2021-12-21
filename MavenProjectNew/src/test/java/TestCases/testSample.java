package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumUtility;

public class testSample extends SeleniumUtility{
	
	@FindBy(id="txtUsername")
	private WebElement usernameInput;

	@FindBy(id="txtPassword")
	private WebElement passwordInput;
	
	@FindBy(id="btnLogin")
	private WebElement loginbutton;
	
	
	testSample(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void LoginMethod(String Un, String Pwd) {
		usernameInput.sendKeys(Un);
		passwordInput.sendKeys(Pwd);
		loginbutton.click();
	}
}

	