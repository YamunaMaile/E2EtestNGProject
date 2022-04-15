package com.TestCases;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PageObjectModel.SignInPageObjects;
import com.PageObjectModel.SignUpPageObjects;
import com.Resources.BaseClass;
import com.Resources.constant;

public class VerifySingUpFlow extends BaseClass{

	@Test
	public void executeSignUpFlow ()
	{
		
		SignInPageObjects singInPageObject=new SignInPageObjects(driver);
		
		SignUpPageObjects singUpPageObject=new SignUpPageObjects(driver);
		
		
		singInPageObject.clickOnSignUpButton().click();
		
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(singUpPageObject.firstName())); //not working
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='UserFirstName']")));  //working
	 wait.until(ExpectedConditions.visibilityOfElementLocated(singUpPageObject.firstname()));  //working- method should return By element
		
		
		singUpPageObject.firstName().sendKeys(constant.firstName);
		singUpPageObject.lastName().sendKeys(constant.lastName);
		singUpPageObject.workEmail().sendKeys(constant.workEmail);
		
		Select jobSelection=new Select(singUpPageObject.jobTitle());
	//	jobSelection.selectByIndex(1); //it will select 2nd option from list
		//jobSelection.selectByValue(constant.jobTitle); //it will take value attribute value
		jobSelection.selectByVisibleText(constant.jobTitle);
		
		singUpPageObject.companyName().sendKeys(constant.company);
		
		Select employeesSelection=new Select(singUpPageObject.employees());
		//employeesSelection.selectByIndex(2); //it will select 3rd option from list
		employeesSelection.selectByVisibleText(constant.employees);
		
		singUpPageObject.phoneNumber().sendKeys(constant.phone);
		
		Select countrySelection=new Select(singUpPageObject.countryOrRegion());
		//countrySelection.selectByIndex(4);// it will select 5th element from list
		countrySelection.selectByVisibleText(constant.country);
		
		Select countryStateSelection=new Select(singUpPageObject.selectedCountryState());
		countryStateSelection.selectByVisibleText(constant.countryState);
		
		singUpPageObject.agreeCheckbox().click();
		
		
	}

}
