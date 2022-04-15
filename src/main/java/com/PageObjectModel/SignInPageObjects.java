package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObjects {

	//this driver doesn't have any scope
	public WebDriver driver;
	
	private By usernameXpath=By.xpath("//input[@id='username']");
	private By passwordXpath=By.xpath("//input[@id='password']");
	private By loginButtonXpath=By.xpath("//input[@id='Login']");
	private By signUpButtonXpath=By.xpath("//a[@id='signup_link']");


	public SignInPageObjects(WebDriver driver2) {
		this.driver=driver2; //initializing the driver value for current class driver
	}

	//accessing private elements by public methods and returning web elements
	public WebElement enterUsername()
	{
		return driver.findElement(usernameXpath);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(passwordXpath);
		
	}
	
	
	public WebElement clickOnLoginButton()
	{
		return driver.findElement(loginButtonXpath);
		
	}
	
	public WebElement clickOnSignUpButton()
	{
		return driver.findElement(signUpButtonXpath);
		
	}
}
