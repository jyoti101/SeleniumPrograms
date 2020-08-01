import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopHandle {
	
	@Test(enabled = false)
	public void popup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("12345");
	driver.findElement(By.name("submit")).click();
    
	Alert alert = driver.switchTo().alert();
	String alertText = alert.getText();
	System.out.println(alertText);
	alert.accept();
	Thread.sleep(1000);
	Alert alert1 = driver.switchTo().alert();
	String Alert1Text = alert1.getText();
	System.out.println(Alert1Text);
	alert1.accept();
}
	
	@Test(enabled = false)
	public void PopupDissmiss() {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> Allwindows = driver.getWindowHandles();
		Iterator<String> i1 = Allwindows.iterator();
		while(i1.hasNext())
		{
			String Childwindow = i1.next();
			
			if(!MainWindow.equalsIgnoreCase(Childwindow))
			{
				driver.switchTo().window(Childwindow);
				driver.findElement(By.name("emailid")).sendKeys("jyoti@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
			driver.switchTo().window(MainWindow);
		
		}
	

	
}
	
}
		
		
		
	
			
