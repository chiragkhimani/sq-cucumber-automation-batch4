package com.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHomePage extends BasePage {

	@FindBy(id = "branding")
	WebElement logo;

	@FindBy(xpath = "//a[@id='menu_admin_Job']/following-sibling::ul//li/a")
	List<WebElement> jobDropdownOption;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	@FindBy(id = "menu_admin_Job")
	WebElement jobMenu;

	@FindBy(id = "menu_recruitment_viewRecruitmentModule")
	WebElement recrutmentMenu;

	@FindBy(id = "menu_recruitment_viewJobVacancy")
	WebElement vacanciesMenu;

	String xpathData = "//table[@id='resultTable']/tbody/tr[%s]/td[@class][%s]";

	public void verifyHomePage() {
		Assert.assertTrue("Logo is not present on homepage", logo.isDisplayed());
	}

	public void verifyDrodownItems(List<String> expectedItems) {

		Actions action = new Actions(driver);
		action.moveToElement(adminMenu).moveToElement(jobMenu).build().perform();

		for (int i = 0; i < jobDropdownOption.size(); i++) {
			String actData = jobDropdownOption.get(i).getText();
			String expData = expectedItems.get(i);

			Assert.assertTrue("expected - " + expData + " but actual we got - " + actData, actData.equals(expData));
		}
	}

	public void clickOnVacanciesMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(recrutmentMenu).pause(1000).click(vacanciesMenu).build().perform();
	}

	public void verifyVacanciesData(List<List<String>> tableOfData) {
		for (int i = 0; i < tableOfData.size(); i++) {
			for (int j = 0; j < tableOfData.get(i).size(); j++) {
				// In the xpath position starts from 1 so that's why we need to do i+1 & j+1
				// when we start i and j with zero
				String loc = String.format(xpathData, i + 1, j + 1);
				String actData = driver.findElement(By.xpath(loc)).getText();
				String expData = tableOfData.get(i).get(j);
				Assert.assertTrue("expected - " + expData + " but actual we got - " + actData, actData.equals(expData));
			}
		}
	}

}
