package com.AutomationBasics.readproperty;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	
		private static final String filepath="locators.properties";
		public static  String Systempath;
		private static Properties prop=new Properties();
		
		public static FileInputStream fis=null;
		
		 static{
			try{
				 Systempath = System.getProperty("user.dir");
			fis=new FileInputStream(Systempath+File.separator+filepath);
			prop.load(fis);
			fis.close();
			}catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
			
		
	}
		

	 public  static String getValue(String element){
		 String locator=prop.getProperty(element);
		return locator;
		
	}
	}