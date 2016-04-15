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
import com.lh.common.pageobjects.ChangeEmailPageTomcat;

import lh.com.utility.Log;

public class ChangeEmailPageTomcatTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPageTomcat signInPageTomcat;
	private BasePageTomcat basePageTomcat;
	private MyActivitiesPageTomcat myActivitiesPageTomcat;
	private AccountProfilePageTomcat accountProfilePageTomcat;
	private ChangeEmailPageTomcat changeEmailPageTomcat;
	

	
	//private CreateAccountPageTomcat createAccountPageTomcat;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
			
			Log.startTestCase("ChangEmailPageTomcat");
			
		}
		
		@AfterClass
		public void setDown() {
						
			Log.endTestCase("ChangeEmailPageTomcat");
			
		}
		
		
		@Test
		public void verifyChangeEmailPage() throws InterruptedException {

			
			System.out.println("Sign In functionality details...");
			basePageTomcat = new BasePageTomcat(driver);
			myActivitiesPageTomcat	= new MyActivitiesPageTomcat(driver);
			accountProfilePageTomcat = new AccountProfilePageTomcat(driver);
			
			System.out.println("verify SignIn (1)");
			signInPageTomcat = basePageTomcat.clickSignInBtn();
			
			System.out.println("Verify SignIn (2)");
			Assert.assertTrue(signInPageTomcat.verifySignInPageTitle(), "Sign In page title doesn't match");
			Thread.sleep(2000);
			System.out.println("Assert (1)");
			Assert.assertTrue(signInPageTomcat.verifySignInPageText(), "Page text not matching");
			Thread.sleep(2000);
			System.out.println("Assert (2)");
			Assert.assertTrue(signInPageTomcat.verifySignIn(), "Unable to sign in");
			Thread.sleep(2000);
			System.out.println("Assert (3)");
			
			System.out.println("END OF TEST verifyChangeEmailPage()");
			
		}
		
		@Test
		public void verifyOpenAccountProfilePage() throws Exception{
			
			accountProfilePageTomcat = signInPageTomcat.clickonAccountProfileLink();
			Thread.sleep(2000);
			
			System.out.println("After Assert (3-1)");
			
			changeEmailPageTomcat = accountProfilePageTomcat.clickonChangeEmailLink();
			Thread.sleep(2000);
			
			System.out.println("After Assert (3-2)");
			
			changeEmailPageTomcat.emailErrorCheck();

			Log.info("Start the next method start 4000.");

			myActivitiesPageTomcat.clickOnLogoutButton();
			Log.info("My Activities Page logout button clicked.");
				
			System.out.println("END OF TEST");
		
			}
		

		
		public void verifyMyActivitiesFunctions() {
			
		}

}