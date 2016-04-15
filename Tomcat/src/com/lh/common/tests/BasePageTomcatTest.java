package com.lh.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lh.base.TestBaseSetup;
import com.lh.common.pageobjects.BasePageTomcat;

public class BasePageTomcatTest extends TestBaseSetup{
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		Assert.assertTrue(basePageTomcat.verifyBasePageTitle(), "Base Page title doesn't match");
		Assert.assertTrue(basePageTomcat.verifyBasePageHomeLink(), "Base Page Home Link not present.");
		Assert.assertTrue(basePageTomcat.verifyBasePageHelpLink(), "Base Page Help Link not present.");
		Assert.assertTrue(basePageTomcat.verifyBasePageResetPasswordLink(), "Base Page Create Account Link not present.");
		Assert.assertTrue(basePageTomcat.verifyBasePageCreateAccountLink(), "Base Page Reset Password Link not present.");
		Assert.assertTrue(basePageTomcat.verifyBasePageLoginLink(), "Base Page Login link not present");
		Assert.assertTrue(basePageTomcat.verifyBasePageWelcomeToPortalText(), "Base Page Welcome to Portal Text not present");
		Assert.assertTrue(basePageTomcat.verifyBasePageNavigatePortalText(), "Base Page Navigate Portal Text not present");
		
	}

}