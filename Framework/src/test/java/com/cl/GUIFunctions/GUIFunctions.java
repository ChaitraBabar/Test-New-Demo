package com.cl.GUIFunctions;

import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class GUIFunctions {
	WebDriver driver;
	public static Properties p;
	
		//delete all cookies
		public static void deleteAllCookies(WebDriver driver){
			driver.manage().deleteAllCookies();
			System.out.println("cookies are deleted");
		}
		
		//Verifying the Element
		public static boolean isElementPresent(By by, WebDriver driver) 
		{
			try 
			{
				System.out.println("element is present inside isElementPresent()");
				driver.findElement(by);
				return true;
			} 
			catch (NoSuchElementException e) 
			{
				System.out.println("catch of isElementPresent()");
				System.out.println("element is not present");
				return false;
			}
		}
		
		//sleep
		public static void sleep() throws InterruptedException{	
					Thread.sleep(5000);
				}
		//Mouse Hover
		
		public static void mouseHoveronElementandClick(WebDriver driver, WebElement ele){
			try{
				Actions act = new Actions(driver);
				act.moveToElement(ele).click().build().perform();
				
			}catch(NoSuchElementException e){
				
				System.out.println("No such element found");
			}
		}
		
		//click button
				public static void clickButton(WebDriver driver, By by)
				{
					try{
						driver.findElement(by).click();
					System.out.println("Successfully clicked the button ");					}
					 catch (NoSuchElementException e) {
						 System.out.println("Button to click is not present because of" + e);
				}
				}
				
				//enter text into text field
				public static void enterTextinToTextBox(WebDriver driver, By by, String str){
					driver.findElement(by).clear();
					driver.findElement(by).sendKeys(str);
					
					//log.info("text is filled with the given value");		
				}
				
}

