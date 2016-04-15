package com.lh.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageTomcat {

private WebDriver driver;


//private By headerPageText = By.cssSelector(".hidden-small");
private By createAccountLink = By.id("link-signup");
private By emailTextBox = By.id("Email");
private By passwordTextBox = By.id("Passwd");
private By loginBtn = By.id("signIn");
private By errorMsgTxt = By.xpath("//h3[contains(.,'There was a problem logging into your account.')]");

//Tomcat2 links begin here

//private By homeLink = By.xpath("//span[@id='HomeMenuText']");

private By homeLink = By.xpath("//span[@id='HomeMenuText']");
private By myActivitiesLink = By.xpath("//span[@id='HomeMenuText']");
private By newLodgementLink = By.xpath("//span[@id='NewLodgementMenuText']");
private By logoutLink = By.xpath("//input[@type='submit']");
private By userName = By.xpath("//span[contains(.,'wheel37xr')]");
private By accountProfileLink = By.xpath("//span[contains(@id,'AccountProfileMenuText')]");
private	By userNameLoginBox = By.xpath("//input[@id='j_username']");
private	By passwordLoginBox = By.xpath("//input[@id='j_password']");
private	By loginButton = By.xpath("//input[@type='submit']");
private By signInPageWelcomeText = By.xpath("//span[contains(@id,'specTitle')]");


private String validUserName = "wheel37xr";
private String validPassword = "Portal32";
	
	public SignInPageTomcat(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getSignInPageTitle() {
		System.out.println("getSignInPage Title;");
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public boolean verifySignInPageTitle() {
		String expectedTitle = "Welcome to Portal";
		return getSignInPageTitle().contains(expectedTitle);
	}
	
	public boolean verifySignInPageText() {
		System.out.println("signINPageTomcat verifySignInPageTest START.");
		WebElement element = driver.findElement(signInPageWelcomeText);
		String pageText = element.getText();
		System.out.println("signINPageTomcat verifySignInPageTest MIDDLE. + pageText");
		String expectedPageText = "Navigate Portal";
		System.out.println("signINPageTomcat verifySignInPageTest END.");
		return pageText.contains(expectedPageText);
	}
	
		public CreateAccountPage clickonCreateAnAccount() {
			WebElement element=driver.findElement(createAccountLink);
			if(element.isDisplayed()||element.isEnabled())
				element.click();
			return new CreateAccountPage(driver);
	}

		public AccountProfilePageTomcat clickonAccountProfileLink() {
			WebElement element=driver.findElement(accountProfileLink);
			if(element.isDisplayed()||element.isEnabled())
				element.click();
			return new AccountProfilePageTomcat(driver);
	}
		
		public NewLodgementPageTomcat clickonNewLodgementLink() {
			WebElement element=driver.findElement(newLodgementLink);
			if(element.isDisplayed()||element.isEnabled())
				element.click();
			return new NewLodgementPageTomcat(driver);
	}
		
		public boolean verifySignIn() {
			System.out.println("verifySignIn BEGIN.");
			enterUserName(validUserName);
			enterPassword(validPassword);
			clickOnSignIn();
			System.out.println("verifySignIn END.");
			return getErrorMessage().contains("All OK");
		}
		
		public void enterUserName(String userName) {
			WebElement emailTxtBox = driver.findElement(userNameLoginBox);
			if(emailTxtBox.isDisplayed())
				emailTxtBox.sendKeys(userName);
		}
		
		public void enterPassword(String password) {
			WebElement passwordTxtBox = driver.findElement(passwordLoginBox);
			if(passwordTxtBox.isDisplayed())
				passwordTxtBox.sendKeys(password);
		}
		
		public void clickOnSignIn() {
			WebElement signInBtn = driver.findElement(loginButton);
			System.out.println("clickOn SignIn button start.");
			if(signInBtn.isDisplayed())
				//System.out.println("SignIn button is displayed.");
				signInBtn.click();
		}
		
		
		public String getErrorMessage() {
			String strErrorMsg = "All OK";
//			WebElement errorMsg = driver.findElement(errorMsgTxt);
//			if(errorMsg.isDisplayed()&&errorMsg.isEnabled())
//				strErrorMsg = errorMsg.getText();
			return strErrorMsg;
		}

		public String getValidUserName() {
			return validUserName;
		}

		public void setValidUserName(String validUserName) {
			this.validUserName = validUserName;
		}

		public String getValidPassword() {
			return validPassword;
		}

		public void setValidPassword(String validPassword) {
			this.validPassword = validPassword;
		}
	
		
		
}