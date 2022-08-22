package com.cl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cl.utility.ConfigDataProvider;

public class FL_LP {

	WebDriver driver;
	public ConfigDataProvider config;
	
	public FL_LP(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	// Email ID
	
	@FindBy(xpath="//input[@type='email']") WebElement emailID;
	
	//Next CTA
	@FindBy(xpath="(//span[@class='VfPpkd-vQzf8d'])[2]") WebElement nextcta;
	
	//Password
	@FindBy(xpath="//input[@type='password']") WebElement password;
	
	
	public void enterEmailId(String email)
	{
		try
		{
			Thread.sleep(2000);
		} catch(InterruptedException e)
		{
			
		}
		emailID.sendKeys(email);
		
	}
	
	public void clicknextcta()
	{
		nextcta.click();
	}
	
	public void enterpassword(String pass)
	{
		try
		{
			Thread.sleep(2000);
		} catch(InterruptedException e)
		{
			
		}
		password.sendKeys(pass);
	}
}
