package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

public	WebDriver driver;
	
private By firstNameXpath=By.xpath("//input[@name='UserFirstName']");
private By lastNameXpath=By.xpath("//input[@name='UserLastName']");
private By workEmailXpath=By.xpath("//input[@name='UserEmail']");
private By jobTitleXpath=By.xpath("//select[@name='UserTitle']");
private By companyXpath=By.xpath("//input[@name='CompanyName']");
private By employeesXpath=By.xpath("//select[@name='CompanyEmployees']");
private By phoneXpath=By.xpath("//input[@name='UserPhone']");
private By countryRegionXpath=By.xpath("//select[@name='CompanyCountry']");
private By countryStateXpath=By.xpath("//select[@name='CompanyState']");
private By agreeCheckboxXpath=By.xpath("//div[@class='checkbox-ui']");


public SignUpPageObjects(WebDriver driver2) {
	this.driver=driver2;
}

public By firstname()
{
	return firstNameXpath;
}
public WebElement firstName()
{
	return driver.findElement(firstNameXpath);
}

public WebElement lastName()
{
	return driver.findElement(lastNameXpath);
}
public WebElement workEmail()
{
	return driver.findElement(workEmailXpath);
}
public WebElement jobTitle()
{
	return driver.findElement(jobTitleXpath);
}

public WebElement companyName()
{
	return driver.findElement(companyXpath);
}

public WebElement employees()
{
	return driver.findElement(employeesXpath);
}


public WebElement phoneNumber()
{
	return driver.findElement(phoneXpath);
}

public WebElement countryOrRegion()
{
	return driver.findElement(countryRegionXpath);
}

public WebElement selectedCountryState()
{
	return driver.findElement(countryStateXpath);
}

public WebElement agreeCheckbox()
{
	return driver.findElement(agreeCheckboxXpath);
}


}
