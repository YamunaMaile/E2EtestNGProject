package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjectModel.SignInPageObjects;
import com.Pages.SignInPage;
import com.Resources.BaseClass;
import com.Resources.constant;

public class VerifySingInFlow extends BaseClass {

	//SignInPageObjects singInPageObject = new SignInPageObjects(driver);

	@Test
	public void executeSingInFlow() {
		try {
			// SignInPage signinpage=new SignInPage(driver);
			SignInPageObjects singInPageObject = new SignInPageObjects(driver);

			singInPageObject.enterUsername().sendKeys(constant.userName);
			singInPageObject.enterPassword().sendKeys(constant.password);
			singInPageObject.clickOnLoginButton().click();

			// singInPageObject.clickOnSignUpButton().click();
//				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			/*
			 * signinpage.enterUserName(); signinpage.enterPassWord();
			 * signinpage.clickOnLoginButton();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
