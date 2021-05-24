package com.automate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	/*user[email]
	 *user[password]
	 *user[remember_me]
	 //input[@value='Sign in']*/
	
	@FindBy(id="user[email]") WebElement emailId;
	@FindBy(id="user[password]") WebElement pswd;
	@FindBy(id="user[remember_me]") WebElement rememberMe;
	@FindBy(xpath="//input[@value='Sign in']") WebElement loginBtn;
	
	public void loginToApp(String email,String password) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		emailId.sendKeys(email);
		pswd.sendKeys(password);
		rememberMe.click();
		loginBtn.click();
	}

	
}
