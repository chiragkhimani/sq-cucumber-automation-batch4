package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {

	@FindBy(xpath = "//div[contains(@class,'inventory_details_name')]")
	WebElement itemTitle;

	@FindBy(className = "inventory_details_price")
	WebElement itemPrice;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cartIcon;

	public void verifyTitle() {
		Assert.assertTrue("Item name is not present on pdp page", itemTitle.isDisplayed());
	}

	public void verifyPrice() {
		Assert.assertTrue("Item price is not present on pdp page", itemPrice.isDisplayed());
	}

	public void clickOnAddToCartBtn() {
		addToCartBtn.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}
}
