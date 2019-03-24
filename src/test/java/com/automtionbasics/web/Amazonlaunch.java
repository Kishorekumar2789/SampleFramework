package com.automtionbasics.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.AutomationBasics.Modulemethods.Helper;
import com.AutomationBasics.readproperty.ReadProperty;

public class Amazonlaunch {

	
	static  WebDriver driver;
	
	
	@Test
	public static void applaunch(){
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","F://AutomationDemo//Driver//ChromeDriver//chromedriver.exe");
		driver=new ChromeDriver();
		
		
		String url=ReadProperty.getValue("url");
		String searchtextbox=ReadProperty.getValue("searchtextarea");
		String SearchButton=ReadProperty.getValue("SearchButton");
		String Searchdropbox=ReadProperty.getValue("SearchDropbox");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		/*Select select=new Select(driver.findElement(By.id(Searchdropbox)));
		select.selectByVisibleText("Electronics");*/
		
		Helper.dropdownselect(driver, Searchdropbox, "Electronics");
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Helper.xpathSendtext(driver, searchtextbox, "oneplus6");
		Helper.clickbyxpath(driver, SearchButton);
	   /* driver.findElement(By.xpath(searchtextbox)).sendKeys("oneplus6");
	    driver.findElement(By.xpath(SearchButton)).click();*/
	}
	@Test
	public static void toolsqa(){
		
		String firstname=ReadProperty.getValue("firstname");
		String lastname=ReadProperty.getValue("lastname");
		String Male=ReadProperty.getValue("Male");
		String experience=ReadProperty.getValue("experience");
		String Date=ReadProperty.getValue("Date");
		String profession=ReadProperty.getValue("profession");
		String Tool=ReadProperty.getValue("Tool");
		String continents=ReadProperty.getValue("continents");
		String submitbutton=ReadProperty.getValue("submitbutton");
		
		
		
		
		
		
	}
	
	@AfterTest
	
	public  void Teardown(){
		driver.quit();
	}
	
}
