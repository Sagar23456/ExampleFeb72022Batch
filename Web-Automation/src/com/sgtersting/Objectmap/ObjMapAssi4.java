package com.sgtersting.Objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjMapAssi4 {
	public static WebDriver owb=null;
	public static ObjectMap1 objectsmap=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createcustomer();
		createproject();
		deleteproject();
		deletecustomer();
		logout();
		
	}
	private static void launchbrowser()
	{
		String filename=null;
		try {
			filename="C:\\ExampleAutomation\\Web-Automation\\ObjectMap\\ObjectMap.Properties";
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			owb=new ChromeDriver();
			objectsmap=new ObjectMap1(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			owb.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			owb.findElement(objectsmap.getLocator("loginpageusername")).sendKeys("admin");
			owb.findElement(objectsmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			owb.findElement(objectsmap.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createcustomer()
	{
		try {
			owb.findElement(objectsmap.getLocator("taskpage")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("customeraddnewcustomer")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("customercreatenewcustomer")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("customername")).sendKeys("TVS");
			owb.findElement(objectsmap.getLocator("createcustomerbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createproject()
	{
		try {
			owb.findElement(objectsmap.getLocator("createprojectaddnew")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("createnewproject")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("createprojectname")).sendKeys("Bike manfacturing");
			owb.findElement(objectsmap.getLocator("createprojectbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void deleteproject()
	{
		try {
			owb.findElement(objectsmap.getLocator("deleteprojectsetting")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deleteprojectaction")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deleteprojectbutton")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deleteprojectpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			owb.findElement(objectsmap.getLocator("deletecustomersettings")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deletecustomeraction")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deletecustomerbutton")).click();
			Thread.sleep(2000);
			owb.findElement(objectsmap.getLocator("deletecustomerpermanently")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			owb.findElement(objectsmap.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
			owb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}