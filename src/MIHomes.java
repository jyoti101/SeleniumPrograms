import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MIHomes {
	@Test
		public void MIHomesPage() throws InterruptedException 
		{		
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.mihomes.com");
			Thread.sleep(1000);
				WebElement ClickonLink = driver.findElement(By.linkText("Blog"));
			      ClickonLink.click();
				Thread.sleep(2000);
				String ActualTitle= driver.getTitle();
				System.out.println(ActualTitle);
				WebElement recommendedStories = driver.findElement(By.xpath("//h3[@class='h4 sidebar-header']"));
				String RecomStory = recommendedStories.getText();
				WebElement follow = driver.findElement(By.xpath("//p[@class='box-well-sidebar-header']"));
			  String followLinks =	follow.getText();
		/*
		 WebElement categories =
		 driver.findElement(By.xpath("//select[@id='select']")); String
		  categoriesOption = categories.getText();
		 */
				
				String ExpTitle = "Welcome to Better: A Blog by M/I Homes";
				Thread.sleep(1000);
				if(ExpTitle.equals(ActualTitle)) 
				{
					System.out.println("Page has been succesfully navigated to blog page");
				}
				else
				{
					System.out.println("Page is not navigated to blog page");
				}	
					//driver.findElement(By.linkText("Read More")).click();
				if(RecomStory.equals("Recommended Stories")) {
						System.out.println("Page has Recommended stories");
				}
				else 
				{
					System.out.println("Page doesn't have Recommended stories");
                 }
				if (followLinks.equals("FOLLOW M/I HOMES FOR UPDATES")) {
					
					System.out.println("Page has follow M/I homes for updates text");
				}
				else
				{
					System.out.println("Page doesn't have follow text");
				}
				
		}
}
