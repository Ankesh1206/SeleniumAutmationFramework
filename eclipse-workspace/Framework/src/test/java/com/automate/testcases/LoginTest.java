package com.automate.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automate.pages.BaseClass;
import com.automate.pages.LoginPage;
import com.automate.utility.Helper;

public class LoginTest extends BaseClass{
	
	
	@Test(priority = 1)
	public void loginApp() {
		excel.getStringData("Sheet1", 0, 0);
		System.out.println(driver.getTitle());
		
		logger = report.createTest("Login to App");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Application");
		
		//Abstraction - We are hiding the logic like locators,implementation etc..
		loginPage.loginToApp(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet1", 0, 1));
	
		logger.pass("Login passed");
	}
	
	@Test(priority=2)
	public void logout() {
		
		logger = report.createTest("Logout");
		logger.fail("Logout Failed");
		
	}
	
	

}
