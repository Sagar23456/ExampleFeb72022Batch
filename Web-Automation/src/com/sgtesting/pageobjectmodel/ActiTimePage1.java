package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage1 {

	public ActiTimePage1(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}

	//Login Page, User Name Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Login Page, Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//Login Page, Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//Home Page, Flyout Window Field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Home Page,  User Button
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")
	private WebElement oUser;
	public WebElement getUserButton()
	{
		return oUser;
	}

	//Home Page,  Add User
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
	}

	//Add User Page, User Name Text Field
	private WebElement firstName;
	public WebElement getfirstName()
	{
		return firstName;
	}

	//Login Page, User Name Text Field
	private WebElement lastName;
	public WebElement getlastName()
	{
		return lastName;
	}

	//Login Page, User Name Text Field
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}


	//Add User Page, User Name Text Field
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserame()
	{
		return userDataLightBox_usernameField;
	}

	//Home Page, Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}

	private WebElement password;
	public WebElement Loginpassword()
	{
		return password;
	}

	private WebElement passwordCopy;
	public WebElement LoginpasswordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement Create;
	public WebElement Createuser()
	{
		return Create;
	}
	
	//Homepage, Delete User
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement odelete;
	public WebElement getSelect()
	{
		return odelete;
	}
	
	//Homepage, Delete User
	@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDelete()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//Homepage, Modify User
	@FindBy(xpath="//*[@id=\\\"topnav\\\"]/tbody/tr[1]/td[5]/a")
	private WebElement omodify;
	public WebElement getModify()
	{
		return omodify;
	}
	
	//Homepage, Modify User
	@FindBy(xpath="//*[@id=\\\"userListTableContainer\\\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement imodify;
	public WebElement getSelectModify()
	{
		return imodify;
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
	private WebElement clicktasks;
	public WebElement getclicktasks()
	{
		return clicktasks;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement addnewdropdown;
	public WebElement getaddnewdropdown()
	{
		return addnewdropdown;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement addnewcustomer;
	public WebElement getaddnewcustomer()
	{
		return addnewcustomer;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getentercustomername()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement creatcustomer;
	public WebElement getclickcreatcustomer()
	{
		return creatcustomer;
	}
	
	//private WebElement customerLightBox_descriptionField;
	//public WebElement getcustomerdescription()
	//{
	//	return customerLightBox_descriptionField;
	//}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerdetails;
	public WebElement getcustomerdetails()
	{
		return customerdetails;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement selectcustomeraction;
	public WebElement getcustomeractions()
	{
		return selectcustomeraction;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement getclickdeletcustomer()
	{
		return deletecustomer;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getclickdeletepermanentlycustomer()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	private WebElement customerLightBox_descriptionField;
	public WebElement getcustomerdescription()
	{
		return customerLightBox_descriptionField;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement closecustomerwindow;
	public WebElement getclosecustomerwindow()
	{
		return closecustomerwindow;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement customerdesc1;
	public WebElement getcustomerdesc1()
	{
		return customerdesc1;
	}
	
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement addnewproject;
	public WebElement getaddnewproject()
	{
		return addnewproject;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']")
	private WebElement creatproject;
	public WebElement getclickcreatproject()
	{
		return creatproject;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
	private WebElement addnewtask;
	public WebElement getclickaddnewtask()
	{
		return addnewtask;
	}
	
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement creatnewtask;
	public WebElement getcreatnewtask()
	{
		return creatnewtask;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname;
	public WebElement gettaskname()
	{
		return taskname;
	}
	
	private WebElement createTasksPopup_commitBtn;
	public WebElement getclickcreattask()
	{
		return createTasksPopup_commitBtn;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
	private WebElement taskdetails;
	public WebElement gettaskdetails()
	{
		return taskdetails;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
	private WebElement taskactions;
	public WebElement gettaskactions()
	{
		return taskactions;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement deletetaskbutton;
	public WebElement getdeletetaskbutton()
	{
		return deletetaskbutton;
	}
	
	@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitBtn\']/div")
	private WebElement deletetaskpermanently;
	public WebElement getdeletetaskpermanently()
	{
		return deletetaskpermanently;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement projectDetails;
	public WebElement getProjectDetails()
	{
		return projectDetails;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projectAction;
	public WebElement getProjectAction()
	{
		return projectAction;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement clickdeletproject;
	public WebElement getClickDeleteProject()
	{
		return clickdeletproject;
	}
	
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
	private WebElement deleteprojectpermanently;
	public WebElement getDeleteProjectPermanently()
	{
		return deleteprojectpermanently;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerdetailsoption;
	public WebElement getcustomerdetailsoption()
	{
		return customerdetailsoption;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projectDescription;
	public WebElement getprojectDescription()
	{
		return projectDescription;
	}
	
	private WebElement projectDescriptionField;
	public WebElement getInitialProjectDescription()
	{
		return projectDescriptionField;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement closeprojectwindow;
	public WebElement getcloseprojectwindow()
	{
		return closeprojectwindow;
	}
}
