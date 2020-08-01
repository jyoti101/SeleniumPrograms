import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
     @Test(enabled = false)
	public void UploadAFile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload");
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Jyoti nagpal\\Desktop");
		driver.findElement(By.id("terms")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submitbutton")).click();
	
	}
	
     @Test
     public void DownloadFile() {
    	 System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("http://demo.guru99.com/test/yahoo.html");
 		WebElement DownloadBtn = driver.findElement(By.id("messenger-download"));
 		String sourceLocation = DownloadBtn.getAttribute("href");
        String wget_command = "cmd /c D:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try {
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
        System.out.println(ex.toString());
        }
        driver.close();
        }
     }

