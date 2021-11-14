package com.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement homePageItemName;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	List<WebElement> listOfItems;

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement sauceLabsBackPackLink;

	@FindBy(id = "react-burger-menu-btn")
	WebElement menuIcon;

	@FindBy(id = "logout_sidebar_link")
	WebElement logoutBtn;

	public void verifyHomePage() {
		Assert.assertTrue("Item name is not present on home page", homePageItemName.isDisplayed());
	}

	public void verifyProductDetailPageNavigation() {
		ProductDetailPage pdpPage = new ProductDetailPage();

		for (int i = 0; i < listOfItems.size(); i++) {

			listOfItems.get(i).click();

			pdpPage.verifyPrice();
			pdpPage.verifyTitle();

			driver.navigate().back();

			listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		}
	}

	public void selectSauceLabsBackpack() {
		sauceLabsBackPackLink.click();
	}

	public void clickOnMenuIcon() {
		menuIcon.click();
	}

	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
}
