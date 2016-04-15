package com.lh.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccessDeniedPageTomcat {

	private WebDriver driver;
		
	private By accessDeniedHeadingText = By.xpath("//span[@title='Access Denied']");
	private By accessDeniedPageText = By.xpath("//p[contains(.,'Please contact administrator if you think there has been an error')];");
	
	
	public AccessDeniedPageTomcat(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		String pageTitle = "Welcome to Portal";
		return getPageTitle().contains(pageTitle);
	}
	public boolean verifyAccessDeniedPageTomcatHeadingText() {
		WebElement element = driver.findElement(accessDeniedHeadingText);
		String pageText ="Access to the requested";
		return element.getText().contains(pageText);
	}
	
	public boolean verifyAccessDeniedPageTomcatText() {
		WebElement element = driver.findElement(accessDeniedPageText);
		String pageText ="Please contact administrator";
		return element.getText().contains(pageText);
	}
	
	

}