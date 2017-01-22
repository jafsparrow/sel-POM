import org.openqa.selenium.WebDriver;

import utils.BrowserFactory;
import utils.ReadProperties;

public class NewTest {
	
	public static void main(String[] args) {
/*		BrowserFactory brower = new BrowserFactory();
		WebDriver driver = brower.launch_browser("chrome");
		driver.get("http://www.google.com");*/
		
		ReadProperties read = new ReadProperties("C:\\AutoWorkSpace\\Disloser\\PageObjectsProject\\config.properties");
		System.out.println(read.getProperty("URL"));
	}

}
