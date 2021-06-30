package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.Base;
import com.learnautomation.pages.LoginPage;

public class LoginTestCRM extends Base {

	@Test(priority=1)
	public void loginApp() {
		
		logger = report.createTest("Login to CRM");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting Application");
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login success");
		
	}
	
	@Test(priority=2)
	public void loginApp1() {

		logger = report.createTest("Logout");
		logger.fail("Logout failed");
		
	}

}
