package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
		
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//@FindBy(linkText = "https://ui.cogmento.com") WebElement logIn;
	//@FindBy(xpath = ".//div[@class='rd-navbar-wrap']/a") WebElement logIn;
	@FindBy(name = "username") WebElement uname;
	@FindBy(name = "password") WebElement pass;
	@FindBy(xpath = ".//div[@class='input-group-btn']/input") WebElement loginButton;
	
	public void loginToCRM(String applicationUsername, String applicationPassword) {
		//logIn.click();
		uname.sendKeys(applicationUsername);
		pass.sendKeys(applicationPassword);
		loginButton.click();
	}
	
}
