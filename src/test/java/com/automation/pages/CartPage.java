package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement itemName;

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	WebElement itemPrice;

	public void verifyItemDetailsOnCartPage() {
		Assert.assertTrue("Item name is not present on cart page", itemName.isDisplayed());
		Assert.assertTrue("Item price is not present on cart page", itemPrice.isDisplayed());
	}

}
