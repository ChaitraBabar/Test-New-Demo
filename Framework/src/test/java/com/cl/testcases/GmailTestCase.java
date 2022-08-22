package com.cl.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.FL_LP;
import com.cl.utility.BrowserFactory;
import com.cl.utility.ExcelDataProvider;

import lombok.experimental.Helper;

public class GmailTestCase extends BaseClass{
	
	
	
	@Test
	public void login()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		
		
		FL_LP loginpage = PageFactory.initElements(driver, FL_LP.class);
	
		
		loginpage.enterEmailId(excel.getSringData("Login", 0, 0));
		loginpage.clicknextcta();
		loginpage.enterpassword(excel.getSringData("Login", 0, 1));
		
		
	}
}
