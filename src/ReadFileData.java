


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadFileData {
	WebDriver driver;
	Properties prop;
	       public void ReadData() {
		
			File file = new File(".\\Config.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
	}
            
           public String ReadUrl() {
        	   String URL = prop.getProperty("URL");
        	   if(URL != null)
			    return URL;
        	   else
        	   throw new RuntimeException("URL not specified in the Configuration.properties file.");
        	   
           }
}

	
	
