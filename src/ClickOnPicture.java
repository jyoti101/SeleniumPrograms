import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickOnPicture {
	@Test
	public void picClick() {
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//i[@class='fb_logo img sp_Vgu5hh_52BR sx_445ecd']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("We are back to HomePage");
		}
		else
		{
			System.out.println("Title mismatch");
		}
		driver.quit();
	}

}
