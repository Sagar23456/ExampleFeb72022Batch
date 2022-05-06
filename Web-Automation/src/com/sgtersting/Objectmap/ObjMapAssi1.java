package com.sgtersting.Objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjMapAssi1 {
	public static WebDriver wb=null;
	public static ObjectMap1 objmap=null; 
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyout();
		createuser();
		deleteuser();
		logout();
	}
	private static void launchbrowser()
	{
		String filename=null;
		try {
			filename="C:\\ExampleAutomation\\Web-Automation\\ObjectMap\\ObjectMap.Properties";
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Web-Automation\\Library\\Driver\\chromedriver.exe");
			wb=new ChromeDriver();
			objmap=new ObjectMap1(filename);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try {
			wb.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try {
			wb.findElement(objmap.getLocator("loginpageusername")).sendKeys("admin");
			wb.findElement(objmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("loginpageloginbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeflyout()
	{
		try {
			wb.findElement(objmap.getLocator("minimizeflyoutwindow")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try {
			wb.findElement(objmap.getLocator("userslink")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("addusers")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("userspagefirstname")).sendKeys("Demo");
			wb.findElement(objmap.getLocator("userspagelastname")).sendKeys("User1");
			wb.findElement(objmap.getLocator("userspageemail")).sendKeys("demo123@gmail.com");
			wb.findElement(objmap.getLocator("userspageusername")).sendKeys("DemoUser");
			wb.findElement(objmap.getLocator("userspagepassword")).sendKeys("1233456");
			wb.findElement(objmap.getLocator("userspageretypepassword")).sendKeys("123456");
			wb.findElement(objmap.getLocator("userspagecreateuserbutton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteuser()
	{
		try {
			wb.findElement(objmap.getLocator("deleteuserlist")).click();
			Thread.sleep(2000);
			wb.findElement(objmap.getLocator("deleteuserbutton")).click();
			Thread.sleep(2000);
			wb.switchTo().alert().accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try {
			wb.findElement(objmap.getLocator("logoutbutton")).click();
			Thread.sleep(2000);
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
