package com.cl.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.cl.utility.BrowserFactory;
import com.cl.utility.ConfigDataProvider;
import com.cl.utility.ExcelDataProvider;
import com.cl.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getGmailURL());
		System.out.println(driver.getTitle());
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		BrowserFactory.quitrBrowser(driver);
//	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.capturScreenShot(driver);
		}
	}
}
