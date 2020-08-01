import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test098 {

	@Test
	 public void NewTab() {
   System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");

   WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).sendKeys(Keys.CONTROL +"t");
   

}
}