package com.AutomationBasics.Modulemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper {

	
	public static void clickbyid(WebDriver driver, String value){
		
		driver.findElement(By.id(value)).click();
		
	}
	
	public static void dropdownselect(WebDriver driver, String value,String choosenvalue){
		
		Select select=new Select(driver.findElement(By.id(value)));
		select.selectByVisibleText(choosenvalue);
	}
	
	public static void clickbyxpath(WebDriver driver,String valye){
		
		driver.findElement(By.xpath(valye)).click();
	}
public static void xpathSendtext(WebDriver driver,String value, String xpathtext){
		
		driver.findElement(By.xpath(value)).sendKeys(xpathtext);
	}
	
}
