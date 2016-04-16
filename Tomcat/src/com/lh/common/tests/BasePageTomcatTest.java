package com.lh.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lh.base.TestBaseSetup;
import com.lh.common.pageobjects.BasePageTomcat;

public class BasePageTomcatTest extends TestBaseSetup{
	
	private WebDriver driver;
	private BasePageTomcat basePageTomcat;
	
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyHomePageTitle() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageTitle();
		
	}
	
	@Test
	public void verifyBasePageHomeLink() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageHomeLink();
	}
	
	@Test
	public void verifyBasePageHelpLink() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageHelpLink();
	}	
	
	@Test
	public void verifyBasePageResetPasswordLink() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageResetPasswordLink();
	}	
	
	@Test
	public void verifyBasePageCreateAccountLink() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageCreateAccountLink();
	}	
	
	@Test
	public void verifyBasePageLoginLink() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageLoginLink();
	}	
	
	@Test
	public void verifyBasePageWelcomeToPortalText() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageWelcomeToPortalText();
	}	
	
	@Test
	public void verifyBasePageNavigatePortalText() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageNavigatePortalText();
	}	
	
	@Test
	public void verifyBasePageSubmitButton() throws Exception{
		BasePageTomcat basePageTomcat = new BasePageTomcat(driver);
		basePageTomcat.verifyBasePageSubmitButton();
	}	


}