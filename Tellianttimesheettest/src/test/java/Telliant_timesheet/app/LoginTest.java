package Telliant_timesheet.app;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseclass.test;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.TimesheetPage;
import utilities.PropertyFile;
import testlink.TestLinkIntegration;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class LoginTest extends test {
	public static String Actual;
	public static String Expected;
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	TimesheetPage timeSheetPage = PageFactory.initElements(driver, TimesheetPage.class);

	@BeforeClass
	public void f() throws Exception {

		loginpage.Clickloginlink();
	}

	@Test(priority = 1, testName = "test1", description = "LoginTimesheet")
	//@DataProvider(name ="US132_TC01_Verify if Admin is able to Deactivate a role without user mapped")
	public void login() throws TestLinkAPIException {
	
		loginpage.enterUserName(PropertyFile.prop.getProperty("Myusername"));
		loginpage.enterPassword(PropertyFile.prop.getProperty("Mypassword"));
		loginpage.submitLogin();
		Actual = loginpage.validateLoginScreen();
		Expected = PropertyFile.prop.getProperty("ExpectedLoggedUser");
		Assert.assertEquals(Actual, Expected);
		try {TestLinkIntegration.updateResults("DP-59",null,TestLinkAPIResults.TEST_PASSED);
		 
		}
		catch(Exception e){
			TestLinkIntegration.updateResults("validlogin",e.getMessage(),TestLinkAPIResults.TEST_FAILED);
					}
		
	}

	@Test(priority = 2, testName = "test2", description = "ViewTimesheet")
	public void viewtimesheet() throws TestLinkAPIException {

		homePage.clickOnViewTimesheetLink();
		Actual = homePage.validateViewTimeSheetpage();
		Expected = PropertyFile.prop.getProperty("ExpectedURl");
		Assert.assertEquals(Actual, Expected);
		try {TestLinkIntegration.updateResults("DP-60",null,TestLinkAPIResults.TEST_PASSED);
	
		//System.out.println("testcase id"+testlinkAPIClient.getTestCaseIDByName("US132_TC01_Verify if Admin is able to Deactivate a role with user mapped"));
		}
		catch(Exception e){
			TestLinkIntegration.updateResults("validlogin",e.getMessage(),TestLinkAPIResults.TEST_FAILED);
		}
	}

	@Test(priority = 3, testName = "test3", description = "Clear existing actions")
	public void clearExistingAction() throws Exception {

		timeSheetPage.clearExistingProjects();
		timeSheetPage.addProject();
		try {TestLinkIntegration.updateResults("DP-61",null,TestLinkAPIResults.TEST_PASSED);
		
		
		}
		catch(Exception e){
			TestLinkIntegration.updateResults("validlogin",e.getMessage(),TestLinkAPIResults.TEST_FAILED);
		}
	}
		//view.EnterTime();
		// TimesheetPage.saveChanges();
	}

