package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.utils.PropertyReader;

public class OrangeHRMLoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	WebElement userNameInput;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public void doLogin(String username, String password) {
		waitForElementToBeClickable(userNameInput, driver);
		userNameInput.sendKeys(username);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}

	public void openOrangeHRMWebsite() {
		// Loading url in the browser
		driver.get(PropertyReader.getProperty("application.orange.hrm.url"));
	}

}
