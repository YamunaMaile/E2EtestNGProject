package com.Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//declaring public web driver to use in overall project
	public WebDriver driver;
	
	//creating Properties obj to access the property.properties file data
			public Properties property=new Properties();
	
	
	
	public WebDriver initializeWebDriver() throws IOException
	{
		
		//creating FileInputStream obj to read the property.properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\Property.properties");
	
		
		//to store the file obj data(i.e property.properties file data) in property obj
		property.load(file);
		String driverName=property.getProperty("browser");
		
		//checking the condition if browser is chrome/firefox/IE etc using prop.get method
		if(driverName.equals("chrome"))
		{
			WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
			WebDriverManager.chromedriver().setup(); //this will run if system chrome browser is latest version
			driver=new ChromeDriver();
		}
		else if(driverName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(driverName.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Please choose any one broswer");
		}
		
		//returning the initialized driver values
		return driver;
	}
	
	@BeforeMethod //we can give beforetest/beforeclass as well
	public void LaunchBrowser() throws IOException
	{
		driver=initializeWebDriver();
		driver.get(property.getProperty("url"));
	}
}

/*
 * WebDriverManager.chromedriver().setup();

WebDriverManager.firefoxdriver().setup();

WebDriverManager.iedriver().setup();

WebDriverManager.edgedriver().setup();

WebDriverManager.operadriver().setup();

WebDriverManager.phantomjs().setup();
*/
