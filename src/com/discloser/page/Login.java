package com.discloser.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends BaseClass {
	
	WebDriver driver;

	
	//username
	//password
	//login buton
	//forgot
	//register new	
	
	By userName = By.id("username");
	By passWord = By.id("password");
	
	@FindBy(how = How.ID, using ="login_btn") 
	WebElement loginButton;
	
	
	public Login(WebDriver driver) {
		super(driver);
		
		
	}

	private void typeUserName() {
			driver.findElement(userName).sendKeys("UserName");
	}
}
