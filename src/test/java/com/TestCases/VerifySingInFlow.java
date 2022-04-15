package com.TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PageObjectModel.SignInPageObjects;
import com.Resources.BaseClass;

public class VerifySingInFlow extends BaseClass{

	
	
	//SignInPageObjects singInPageObject=new SignInPageObjects(driver);
	
	
	@Test
	public void executeSingInFlow()
	{
		SignInPageObjects singInPageObject=new SignInPageObjects(driver);
		singInPageObject.enterUsername().sendKeys("test123");
		singInPageObject.enterPassword().sendKeys("test123");
		singInPageObject.clickOnLoginButton().click();
		singInPageObject.clickOnSignUpButton().click();
	//	WebDriverWait wait=new WebDriverWait(driver, 50);
	}
}
