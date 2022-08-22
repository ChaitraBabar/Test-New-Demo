package com.cl.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	

		//Capture ScreenShot 
	public static void capturScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(src, new File("./Screenshots/Gmail"+getcurrentDateTime()+".png"));
		} catch(Exception e)
		{
			System.out.println("Unable To Capture Screenshot "+ e.getMessage());
		}
	}
	
	public static String getcurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curentDate=new Date();
		return customFormat.format(curentDate);
	}
}
