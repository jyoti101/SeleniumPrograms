import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	public class TestClass{
	    @Test
		public void testng() {
			WebDriver driver = new ChromeDriver();
			
	  System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		
		 driver.manage().window().maximize();
		// driver.get("https://testing.chartrequest.com/");
		 
		 driver.get("https://www.google.com");
			driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).sendKeys(Keys.CONTROL +"t");
		   
		/*
		 * driver.switchTo().alert();
		 * driver.findElement(By.id("Username")).sendKeys("userName");
		 * driver.findElement(By.id("password")).sendKeys("myPassword");
		 * driver.switchTo().alert().accept(); driver.switchTo().defaultContent();
		 */
		 
		}
		}