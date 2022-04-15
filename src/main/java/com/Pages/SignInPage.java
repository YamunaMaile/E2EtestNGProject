package com.Pages;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.SignInPageObjects;
import com.Resources.BaseClass;
import com.Resources.constant;

public class SignInPage{

public WebDriver driver;

public SignInPage(WebDriver driver2) {
this.driver=driver2;
}

SignInPageObjects singInPageObject=new SignInPageObjects(driver);	

public void enterUserName()
{
	singInPageObject.enterUsername().sendKeys(constant.userName);
}

public void enterPassWord()
{
	singInPageObject.enterPassword().sendKeys(constant.password);
}

public void clickOnLoginButton()
{
	singInPageObject.clickOnLoginButton().click();
}
	//singInPageObject.clickOnSignUpButton().click();
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
}
