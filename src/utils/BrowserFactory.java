package utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	
	//constructor to get the property fiel read to read.

	



	// read the URL froom the properties file and set the driver.get(to that). for ths
	// i can create another util to read property file and return the URL.
	public WebDriver launch_browser(String browser){
		
		ReadProperties prop = new ReadProperties("config.properties");
		
		switch (browser.toLowerCase()) {
		case "chrome":
				System.setProperty("webdriver.chrome.driver", prop.get_chromePath() );
				driver = new ChromeDriver();
				
			break;
		case "ie":
			
			break;

		default:
			//laouch firefox here.
			break;
		}
		
		return driver;
	}


}
