package com.lh.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyActivitiesPage {

	private WebDriver driver;
	private By headerPageTxt = By.cssSelector(".signuponepage.main.content.clearfix>h1");
	
	public MyActivitiesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		String pageTitle = "Create your Google Account";
		return getPageTitle().contains(pageTitle);
	}
	public boolean verifyCreateAccountPageText() {
		WebElement element = driver.findElement(headerPageTxt);
		String pageText ="Create your Google Account";
		return element.getText().contains(pageText);
	}
	
	public void createAccount() {
		//need to write steps for creating an account
	}
}