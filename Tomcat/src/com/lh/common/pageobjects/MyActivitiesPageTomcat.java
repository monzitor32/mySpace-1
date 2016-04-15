package com.lh.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lh.com.utility.Log;

public class MyActivitiesPageTomcat {

	
	
	@FindBy(xpath = "j_idt5:nome")
	private WebElement inputNome;
	
	@FindBy(xpath ="//input[contains(@id,'idOfInputField')]")
    private WebElement someWebElement;
	
	private WebDriver driver;
	private By headerPageTxt = By.xpath("//span[@class='form-header']");
	private By accountHeadingText = By.xpath("//td[@id='MyAccountHeading']");
	private By myActivitiesLink = By.xpath("//span[contains(@id,'MyAccountMenuText')]");
	private By accountProfileLink = By.xpath("//span[contains(@id,'AccountProfileMenuText')]");
	private By newLodgementLink = By.xpath("//span[@id='NewLodgementMenuText']");
	private By homeLink = By.xpath("//span[@id='HomeMenuText']");
	private By panelRight = By.xpath("//p[contains(.,'PanelRight')]");
	private By panelLeft = By.xpath("//p[contains(.,'PanelLeft')]");
	private By logoutButton = By.xpath("//input[@type='submit']");
	private By accountUsername = By.xpath("//span[contains(.,'wheel37xr')]");
	
	
		
	public MyActivitiesPageTomcat(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyMyActivitiesPageTomcatTitle() {
		String pageTitle = "Welcome to Portal";
		return getPageTitle().contains(pageTitle);
	}
	
	public boolean verifyMyActivitiesPageTomcatText() {
		WebElement element = driver.findElement(accountHeadingText);
		String pageText ="This is your My Activities page.";
		return element.getText().contains(pageText);
	}
	
	public boolean verifyMyActivitiesPageAccountProfileLink() {
		System.out.println("verifyMyActivitiesPageTomcatdLink.1");
		Log.info("verifyMyActivitiesPageTomcatdLink.1");
		WebElement element = driver.findElement(accountProfileLink);
		System.out.println("verifyMyActivitiesPageTomcatdLink.2");
		Log.info("verifyMyActivitiesPageTomcatdLink.2");
		return (element.isDisplayed()||element.isEnabled());
	}
	
	public boolean verifyMyActivitiesPageNewLodgementLink() {
		System.out.println("verifyMyActivitiesPageNewLodgementLink.1");
		WebElement element = driver.findElement(newLodgementLink);
		System.out.println("verifyMyActivitiesPageNewLodgementLink.2");
		return (element.isDisplayed()||element.isEnabled());
	}
	
	public boolean verifyMyActivitiesPageHomeLink() {
		WebElement element = driver.findElement(homeLink);
		return (element.isDisplayed()||element.isEnabled());
	}
	
	public boolean verifyMyActivitiesPageLogoutButton() {
		WebElement element = driver.findElement(logoutButton);
		return (element.isDisplayed()||element.isEnabled());
	}
	
	
	public String getMyActivitiesPageUsernameText() {
		WebElement element = driver.findElement(accountUsername);
		String pageText = element.getText();
		return pageText;
	}
	
	public void clickOnLogoutButton() {
		WebElement logoutBtn = driver.findElement(logoutButton);
		System.out.println("clickOn Logout button start.");
		if(logoutBtn.isDisplayed())
			//System.out.println("SignIn button is displayed.");
			logoutBtn.click();
	}
	
	
//	public void createAccount() {
//		//need to write steps for creating an account
//	}
	
	
}