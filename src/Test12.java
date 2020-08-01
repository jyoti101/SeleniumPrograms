
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    



public class Test12 {
	

ReadFileData readfileData = new ReadFileData();
WebDriver driver;

  @Test
  public void launchbrowser() throws IOException {
  System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
   driver = new ChromeDriver();
  driver.manage().window().maximize();
  
 // driver.get("http://www.facebook.com");
 driver.get(readfileData.ReadUrl());
  
  

  driver.findElement(By.xpath("//*[@id='fsl']/a[1]")).sendKeys(Keys.CONTROL +"t");
  } 

  @Test
  public void Test134() {
	  System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testing.chartrequest.com/");
		 driver.switchTo().alert();
		 driver.findElement(By.id("Username")).sendKeys("userName");
		 driver.findElement(By.id("password")).sendKeys("myPassword");
		 driver.switchTo().alert().accept();
		 driver.switchTo().defaultContent();
		
  }
  
  
  
}
 