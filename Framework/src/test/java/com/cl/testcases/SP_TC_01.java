package com.cl.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cl.pages.BaseClass;
import com.cl.pages.SignInPage;
import com.cl.utility.ExcelDataProvider;

public class SP_TC_01 extends BaseClass{
	
	
	@Test(priority=1, description="Step 1: Delete All Coockies")
	public void deleteAllCoockies()
	{
		
		System.out.println("Step1 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clearchach();
		System.out.println("Step1 ends");
	}
	
	@Test(priority=2, description="Step 2: Mouse Hover On the Hello, Sign In")
	public void mouseHover()
	{
		
		System.out.println("Step2 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.cmousehoveronpicto();
		System.out.println("Step2 ends");
	}
	
	@Test(priority=3, description="Step 3: Click on Sign In CTA")
	public void clickOnSignInCTA()
	{
		
		System.out.println("Step3 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonSignInCTA();
		System.out.println("Step3 ends");
	}
	
	@Test(priority=4, description="Step 4: Click on Email ID Text Field")
	public void clickOnEmailIdTextField()
	{
		
		System.out.println("Step4 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonemailid();
		System.out.println("Step4 ends");
	}
	
	@Test(priority=5, description="Step 5: Enter Email Id")
	public void enterEmailIdOnTextField()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		System.out.println("Step5 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.enteremailid(excel.getSringData("Login", 0, 0));
		System.out.println("Step5 ends");
	}
	
	@Test(priority=6, description="Step 6: Click On Continue CTA")
	public void clickOnContinueCTA()
	{
		System.out.println("Step6 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickOnContinueCTA();
		System.out.println("Step6 ends");
	}
	
	@Test(priority=7, description="Step 7: Click on Password Text Field")
	public void clickOnPasswordTextField() throws InterruptedException
	{
		System.out.println("Step7 Starts");
		Thread.sleep(4000);
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickonpassword();
		System.out.println("Step7 ends");
	}
	
	@Test(priority=8, description="Step 8: Enter Password")
	public void enterpasswordOnTextField()
	{
		ExcelDataProvider excel=new ExcelDataProvider();
		System.out.println("Step8 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.enterpsw(excel.getSringData("Login", 0, 1));
		System.out.println("Step8 ends");
	}
	
	@Test(priority=9, description="Step 9: Enter Password")
	public void clickOnTheSignInCTA()
	{
		System.out.println("Step9 Starts");
		SignInPage loginpage = PageFactory.initElements(driver, SignInPage.class);
		loginpage.clickOnTheSignInCTA();
		System.out.println("Step9 ends");
	}
	
}