package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	//this class is to erad config file with the key is given.
	
	private Properties prop;
	
	public ReadProperties(String filePath) {
		try {
			prop = new Properties();
			File file = new File(filePath);
			FileInputStream fileStream = new FileInputStream(file);
			Properties prop = new Properties();
		
			prop.load(fileStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public String getProperty(String strPropertyName) {

		String propVal = prop.getProperty(strPropertyName);
		
		if (propVal == null) {
			return "";
		} else {
			return propVal;
		}
	}
	
	
	public String get_chromePath(){
		return prop.getProperty("ChromDriverPath");
	}
	
	public String get_geckoPath(){
		return prop.getProperty("FireFoxDriverPath");
	}
	
	public String get_app_URL(){
		return prop.getProperty("URL");
	}
}
