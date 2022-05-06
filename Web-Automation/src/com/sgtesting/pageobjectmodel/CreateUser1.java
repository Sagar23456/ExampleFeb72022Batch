package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		DeleteUser();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage1(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oPage.getUserButton().click();
			oPage.getAddUser().click();
			oPage.getfirstName().sendKeys("Demo");
			oPage.getlastName().sendKeys("User1");
			oPage.getemail().sendKeys("Demo@gmail.com");
		    oPage.getUserame().sendKeys("DemoUser");
			oPage.Loginpassword().sendKeys("123456");
			oPage.LoginpasswordCopy().sendKeys("123456");
			Thread.sleep(5000);
			oPage.Createuser().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void DeleteUser()
	{
		try
		{
			oPage.getUserButton().click();
			Thread.sleep(2000);
			oPage.getSelect().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String s=oAlert.getText();
			System.out.println(s);
			oAlert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
