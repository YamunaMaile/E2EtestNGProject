package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjectModel.SignInPageObjects;
import com.PageObjectModel.SignUpPageObjects;
import com.Resources.BaseClass;

public class VerifySingUpFlow extends BaseClass{

	@Test
	public void executeSignUpFlow()
	{
		SignUpPageObjects singInPageObject=new SignUpPageObjects(driver);
		singInPageObject.firstName().sendKeys("testing");
		singInPageObject.lastName().sendKeys("singUp");
		singInPageObject.workEmail().sendKeys("test123@gmail.com");
		singInPageObject.companyName().sendKeys("test");
		singInPageObject.phoneNumber().sendKeys("0123456789");
		singInPageObject.agreeCheckbox().click();
	}
	
}
