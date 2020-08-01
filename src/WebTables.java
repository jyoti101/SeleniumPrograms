import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {
   @Test
	public void WebTableHandle() {
	   System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://salesarchitect.exsquared.com");
		driver.findElement(By.id("UserName")).sendKeys("Jyotidemo");
		driver.findElement(By.id("Password")).sendKeys("ex2qa");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		List<WebElement> CommTable = driver.findElements(By.xpath("//div[@id='gview_Communities']"));
		Iterator<WebElement> TableHeader = CommTable.iterator();
		boolean TableHeaderText = TableHeader.hasNext();
		System.out.println(TableHeaderText);
		
}
}