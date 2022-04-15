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
private By EmployeesXpath=By.xpath("//select[@name='CompanyEmployees']");
private By phoneXpath=By.xpath("//input[@name='UserPhone']");
private By countryRegionXpath=By.xpath("CompanyCountry");
private By agreeCheckboxXpath=By.xpath("//div[@class='checkbox-ui']");


public SignUpPageObjects(WebDriver driver2) {
	this.driver=driver2;
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
public WebElement companyName()
{
	return driver.findElement(companyXpath);
}


public WebElement phoneNumber()
{
	return driver.findElement(phoneXpath);
}

public WebElement agreeCheckbox()
{
	return driver.findElement(agreeCheckboxXpath);
}


}
