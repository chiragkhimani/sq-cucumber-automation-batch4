package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.CommonMethods;
import com.automation.utils.DriverUtils;

public class BasePage extends CommonMethods {

	WebDriver driver;

	BasePage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) {
		int number = 1;
		 String str = number / 2 == 1 ? "even" :  "odd";
	}
}
