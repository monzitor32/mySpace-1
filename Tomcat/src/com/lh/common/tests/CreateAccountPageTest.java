package com.lh.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lh.base.TestBaseSetup;

import com.lh.common.pageobjects.BasePage;
import com.lh.common.pageobjects.CreateAccountPage;
import com.lh.common.pageobjects.SignInPage;

public class CreateAccountPageTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
	private CreateAccountPage createAccountPage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
		
		@Test
		public void verifyCreateAnAccountPage() {
			System.out.println("Create An Account page test...");
			basePage = new BasePage(driver);
			signInPage = basePage.clickSignInBtn();
			createAccountPage = signInPage.clickonCreateAnAccount();
			Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");
			Assert.assertTrue(createAccountPage.verifyCreateAccountPageText(), "Page text not matching");
		}
		
		public void verifySignInFunction() {
			
		}

}