import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllBrokenLinks {
	@Test
	public void BrokenLinks() {
	//WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours");
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	
	for(WebElement LinkText : links)
		
	System.out.println(LinkText.getText());
	
	}
}
