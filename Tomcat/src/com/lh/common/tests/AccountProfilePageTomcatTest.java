package com.lh.common.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PauseAction;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.lh.base.TestBaseSetup;
import com.lh.common.pageobjects.BasePage;
import com.lh.common.pageobjects.BasePageTomcat;
//import com.lh.common.pageobjects.CreateAccountPageTomcat;
import com.lh.common.pageobjects.SignInPageTomcat;
import com.lh.common.pageobjects.MyActivitiesPageTomcat;
import com.lh.common.pageobjects.AccountProfilePageTomcat;

import lh.com.utility.Log;

public class AccountProfilePageTomcatTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPageTomcat signInPageTomcat;
	private BasePageTomcat basePageTomcat;
	private MyActivitiesPageTomcat myActivitiesPageTomcat;
	private AccountProfilePageTomcat accountProfilePageTomcat;
	

	
	//private CreateAccountPageTomcat createAccountPageTomcat;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
			
			Log.startTestCase("AccountProfilePageTomcat");
			
		}
		
		@AfterClass
		public void setDown() {
						
			Log.endTestCase("AccountProfilePageTomcat");
			
		}
		
		
		@Test
		public void verifyAccountProfile() throws InterruptedException {

			
			System.out.println("Sign In functionality details...");
			basePageTomcat = new BasePageTomcat(driver);
			myActivitiesPageTomcat	= new MyActivitiesPageTomcat(driver);
			accountProfilePageTomcat = new AccountProfilePageTomcat(driver);
			
			System.out.println("verify SignIn (1)");
			signInPageTomcat = basePageTomcat.clickSignInBtn();
			
			System.out.println("Verify SignIn (2)");
			Assert.assertTrue(signInPageTomcat.verifySignInPageTitle(), "Sign In page title doesn't match");
			System.out.println("Assert (1)");
			Assert.assertTrue(signInPageTomcat.verifySignInPageText(), "Page text not matching");
			System.out.println("Assert (2)");
			Assert.assertTrue(signInPageTomcat.verifySignIn(), "Unable to sign in");
			System.out.println("Assert (3)");
			
			
			accountProfilePageTomcat = signInPageTomcat.clickonAccountProfileLink();
			
			
			
//			Log.info("MyActivities Page tests BEGIN...");
//			basePageTomcat = new BasePageTomcat(driver);
//			signInPageTomcat = new SignInPageTomcat(driver);

//			
//			//signInPageTomcat = basePageTomcat.clickSignInBtn();
//			//myActivitiesPagePageTomcat = basePageTomcat.clickSignInBtn();
//			//createAccountPage = signInPage.clickonCreateAnAccount();
//			
//			Log.info("Sign In Page functionality details...");
//			//basePageTomcat = new BasePageTomcat(driver);
//			Log.info("verify SignIn (1)");
//			//signInPageTomcat = basePageTomcat.clickSignInBtn();
//			Log.info("Verify SignIn (2)");
//		Assert.assertTrue(signInPageTomcat.verifySignInPageTitle(), "Sign In page title doesn't match");
//			Log.info("Assert (1)");
//			Assert.assertTrue(signInPageTomcat.verifySignInPageText(), "Page text not matching");
//			Log.info("Assert (2)");
//			Assert.assertTrue(signInPageTomcat.verifySignIn(), "Unable to sign in");
//			Log.info("Assert (3)");
////			
//			Log.info("My Activities Page Functions begin here..");
//						
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageTomcatTitle(), "Page title not matching");
//			Log.info("Assert (4)");
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageTomcatText(), "Page text not matching");
//			Log.info("Assert (5)");
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageAccountProfileLink(), "Page link not found");
//			Log.info("Assert (6)");
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageHomeLink(), "Page home link not found");
//			Log.info("Assert (7)");
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageNewLodgementLink(), "Page new lodgement link not found");
//			Log.info("Assert (8)");
//			Assert.assertTrue(myActivitiesPageTomcat.verifyMyActivitiesPageLogoutButton(), "Page Logout button link not found");
//			Log.info("Assert (9)");
			Thread.sleep(4000);
			Log.info("AccountProfile after Pause 4000.");
		
		
//			@Test
//			public void myActvitiesPageLogout() {
			Log.info("Syat the next mrthod sftrt 4000.");
//			String userName = myActivitiesPageTomcat.getMyActivitiesPageUsernameText();
//			Log.info("My Activities Page UserName is " + userName + ".");
			myActivitiesPageTomcat.clickOnLogoutButton();
			Log.info("My Activities Page logout button clicked.");
			
		}
			
			
			
			
			
		
		
		
		

		
		public void verifyMyActivitiesFunctions() {
			
		}

}