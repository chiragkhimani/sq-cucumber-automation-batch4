package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.CommonMethods;
import com.automation.utils.DriverUtils;

public class BasePage extends CommonMethods{
	
	WebDriver driver;
	
	BasePage(){
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}
}
