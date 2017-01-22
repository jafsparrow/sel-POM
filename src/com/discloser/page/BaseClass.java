package com.discloser.page;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	WebDriver driver;
	
	
	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}
	//driver.
	//getTitle
	public String get_pageTitle (WebDriver driver){
		return driver.getTitle();
	}
	//get browser.
	//go to Page.
	public WebDriver goto_URL(WebDriver driver, String URL){
		driver.navigate().to(URL);
		
		return driver;
	}
	//refresh the page.
	
	public void refresh_page(WebDriver driver){
		
		driver.navigate().refresh();
	}
	
	//loauch browser.
	//laouch with specific URL.
	//close browser.
	
}
