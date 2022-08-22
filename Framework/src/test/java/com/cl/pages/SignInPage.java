package com.cl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cl.GUIFunctions.GUIFunctions;
import com.cl.utility.ConfigDataProvider;

public class SignInPage {
	
	WebDriver driver;
	public ConfigDataProvider config;
	
	public SignInPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//Sign In Page
	By SignIn_Page=By.xpath("//h1[@class='a-spacing-small']");
	
	//Verifying Sign In Page
	public SignInPage verifySignInPage()
	{
		if(GUIFunctions.isElementPresent(SignIn_Page, driver))
		{
			System.out.println("You are in FQA page");
		}
	  else {
		  try
		  {

	   throw new IllegalStateException("This is not the FQA page");
		  }catch (IllegalStateException e)
		  {
		  }
	  }
		return new SignInPage(driver);
		
	}

	// Hello, Sign In Link
	@FindBy(xpath="//div[@class='nav-line-1-container']") WebElement dropdownpicto;
	
	// Sign In CTA
	By signin=By.xpath("(//span[@class='nav-action-inner'])[2]");
	
	//Email Id
	By emailid_xpath=By.xpath("//input[@id='ap_email']");
	
	//Continue CTA
	By continue_xpath=By.xpath("//input[@id='continue']");

	//Password
	By password_xpath=By.xpath("//input[@id='ap_password']");
	
	//SignIn CTA
	By Sign_in_cta_xpath=By.xpath("//input[@id='signInSubmit']");

	//Click on Hello, Sign In link
public void clearchach()
{
	GUIFunctions.deleteAllCookies(driver);
}

	// Mouse Hover 
public void cmousehoveronpicto()
{
	GUIFunctions.mouseHoveronElementandClick(driver, dropdownpicto);
}

	// Click on Sign In CTA
public void clickonSignInCTA()
{
	GUIFunctions.clickButton(driver, signin);
}

//Click on emailid text field 
public SignInPage clickonemailid()
{
	GUIFunctions.clickButton(driver, emailid_xpath);
	return new SignInPage(driver);
}

//CEnter mail in emailid text field 
public SignInPage enteremailid(String email)
{
	GUIFunctions.enterTextinToTextBox(driver, emailid_xpath, email);
	return new SignInPage(driver);
}

//Click on Continue CTA
public SignInPage clickOnContinueCTA()
{
	GUIFunctions.clickButton(driver, continue_xpath);
	return new SignInPage(driver);
}

//Click on password text field 
public SignInPage clickonpassword()
{
	GUIFunctions.clickButton(driver, password_xpath);
	return new SignInPage(driver);
}

//Enter password in password text field 
public SignInPage enterpsw(String psw)
{
	
	GUIFunctions.enterTextinToTextBox(driver, password_xpath, psw);
	return new SignInPage(driver);
}

//Click on Sign In CTA 
public void clickOnTheSignInCTA()
{
	GUIFunctions.clickButton(driver, Sign_in_cta_xpath);
}
}
