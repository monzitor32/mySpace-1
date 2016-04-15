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
import com.lh.common.pageobjects.NewLodgementPageTomcat;
import com.lh.common.pageobjects.CFLApplicantDetailsTomcat;
import lh.com.utility.Log;

public class NewLodgementPageTomcatTest extends TestBaseSetup {
	private WebDriver driver;
	private SignInPageTomcat signInPageTomcat;
	private BasePageTomcat basePageTomcat;
	private MyActivitiesPageTomcat myActivitiesPageTomcat;
	private AccountProfilePageTomcat accountProfilePageTomcat;
	private ChangeEmailPageTomcat changeEmailPageTomcat;
	private NewLodgementPageTomcat newLodgementPageTomcat;
	private CFLApplicantDetailsTomcat cflApplicantDetailsTomcat;
	

	
	//private CreateAccountPageTomcat createAccountPageTomcat;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
			Log.startTestCase("New Lodgement PageTomcat");
			
		}
		
		@AfterClass
		public void setDown() {
						
			Log.endTestCase("New Lodgement PageTomcat");
			
		}
		
		
		@Test
		public void verifyChangeEmailPage() throws InterruptedException {

			
			System.out.println("Sign In functionality details...");
			basePageTomcat = new BasePageTomcat(driver);
			myActivitiesPageTomcat	= new MyActivitiesPageTomcat(driver);
			accountProfilePageTomcat = new AccountProfilePageTomcat(driver);
			cflApplicantDetailsTomcat = new CFLApplicantDetailsTomcat(driver);
			
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
		/**
		 * Check that we have reached the NewLodgement Page
		 * @throws Exception
		 */
		
		@Test
		public void verifyNewLodgementPageTitle () throws Exception{
			newLodgementPageTomcat = signInPageTomcat.clickonNewLodgementLink();
			Thread.sleep(1000);
			
			try{
			newLodgementPageTomcat.verifyPageTitle();
			}
			
			catch (Exception e){
				Log.error("message");
			}
		
			
			Log.info("Start the next method start 4000.");

//			newLodgementPageTomcat.clickOnLogoutButton();
//			Log.info("My Activities Page logout button clicked.");
				
			System.out.println("END OF TEST");
			
		}
		
	/**
	 * Validate that we can select CFL from primary drop down and selcet applicant details from the secondary drop down.
	 * CFL is (1)
	 * 0=select
	 * 1=CFL
	 * 2=Testing
	 * 3=Update
	 * 	
	 * @throws Exception
	 */
		@Test
		public void verifyNewLodgementCFL() throws Exception{
			
			newLodgementPageTomcat = signInPageTomcat.clickonNewLodgementLink();
			Thread.sleep(2000);
			
			System.out.println("After Assert (3-1)");
			
			//changeEmailPageTomcat = accountProfilePageTomcat.clickonChangeEmailLink();
			Thread.sleep(2000);
			
			newLodgementPageTomcat.verifyGroupSelect(1);
			Thread.sleep(1000);
			newLodgementPageTomcat.verifyTypeSelect(1);
			
			Thread.sleep(1000);
			
			
			System.out.println("After Assert (3-2)");
			
			//changeEmailPageTomcat.emailErrorCheck();

			Log.info("Start the next method start 4000.");

//			newLodgementPageTomcat.clickOnLogoutButton();
//			Log.info("My Activities Page logout button clicked.");
//				
//			System.out.println("END OF TEST");
			
			
			cflApplicantDetailsTomcat  = newLodgementPageTomcat.clickOnSubmitButton();
			
			Thread.sleep(2000);
			
	
			}
		
		@Test
		public void verifySubmitToCFLApplicantPage() throws Exception{
			
			
			
			newLodgementPageTomcat.clickOnLogoutButton();
			Log.info("My Activities Page logout button clicked.");
				
			System.out.println("END OF TEST");
			
		}
		
		public void verifyMyActivitiesFunctions() {
			
		}

}