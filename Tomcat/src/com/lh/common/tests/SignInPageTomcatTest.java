package com.lh.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lh.base.TestBaseSetup;
import com.lh.common.pageobjects.BasePageTomcat;
import com.lh.common.pageobjects.SignInPageTomcat;

public class SignInPageTomcatTest extends TestBaseSetup{
private WebDriver driver;
private SignInPageTomcat signInPageTomcat;
private BasePageTomcat basePageTomcat;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
		
	@Test
	public void verifySignInFunction() { 
		System.out.println("Sign In functionality details...");
		basePageTomcat = new BasePageTomcat(driver);
		System.out.println("verify SignIn (1)");
		signInPageTomcat = basePageTomcat.clickSignInBtn();
		System.out.println("Verify SignIn (2)");
		Assert.assertTrue(signInPageTomcat.verifySignInPageTitle(), "Sign In page title doesn't match");
		System.out.println("Assert (1)");
		Assert.assertTrue(signInPageTomcat.verifySignInPageText(), "Page text not matching");
		System.out.println("Assert (2)");
		Assert.assertTrue(signInPageTomcat.verifySignIn(), "Unable to sign in");
		System.out.println("Assert (3)");
		

	}

}