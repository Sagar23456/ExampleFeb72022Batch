package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		creatcustomer();
		deletcustomer();
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
	
	public static void creatcustomer()
	{
		try
		{
			oPage.getclicktasks().click();
			Thread.sleep(1000);
			oPage.getaddnewdropdown().click();;
			Thread.sleep(1000);
			oPage.getaddnewcustomer().click();
			Thread.sleep(1000);
			oPage.getentercustomername().sendKeys("Customer1");
			Thread.sleep(1000);
			oPage.getcustomerdescription().sendKeys("Initial descrpition");
			Thread.sleep(1000);
			oPage.getclickcreatcustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void creatproject()
	{
		try
		{
			oPage.getaddnewdropdown().click();
			Thread.sleep(1000);
			oPage.getaddnewproject().click();;
			Thread.sleep(1000);
			oPage.getprojectname().sendKeys("Project1");
			Thread.sleep(1000);
			oPage.getInitialProjectDescription().sendKeys("Project a");
			Thread.sleep(1000);
			oPage.getclickcreatproject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteproject()
	{
		try
		{
			oPage.getProjectDetails().click();
			Thread.sleep(1000);
			oPage.getProjectAction().click();
			Thread.sleep(1000);
			oPage.getClickDeleteProject().click();
			Thread.sleep(1000);
			oPage.getDeleteProjectPermanently().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void deletcustomer()
	{
		try
		{
			oPage.getcustomerdetailsoption().click();
			Thread.sleep(1000);
			oPage.getcustomeractions().click();
			Thread.sleep(1000);
			oPage.getclickdeletcustomer().click();
			Thread.sleep(1000);
			oPage.getclickdeletepermanentlycustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void DeleteUser()
	{
		try
		{
			oPage.getSelect().click();
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

