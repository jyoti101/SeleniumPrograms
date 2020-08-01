import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	
	WebDriver driver;
	@Test(enabled = false)
	public void test() {
		
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/radio.html");
	
	}
	@Test(enabled = false)
	public void CheckRadioButton() {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	radio1.click();
	
	WebElement radio2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
	//radio1.clear();
	radio2.click();
	//radio2.clear();
	

	}

	@Test(priority = 1)
	public void CheckBoxcheck() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		  WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		 checkbox1.click();
		  if(checkbox1.isSelected()) {
		  System.out.println("Checkbox is selected");
		  }
		  else {
			  System.out.println("Checkbox 1 is deselected");
		  }
	      Thread.sleep(2000);
		  checkbox1.click();
		  System.out.println("Checkbox has been deselected now");
		 
		/*
		 * WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		 * checkbox2.click();
		 */
	}
	
}
