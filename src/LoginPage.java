

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginPage {
	
	String communityInformation;

		@Test
		 public void MIHomes() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.mihomes.com");
		WebElement eventPage = driver.findElement(By.linkText("Events"));
		eventPage.click();
		Thread.sleep(1000);
		
				 Thread.sleep(1000);
				  WebElement dropdown = driver.findElement(By.xpath("//select[@id='marketId']"));
				dropdown.click();
					 Select MarketDropdwn = new Select(dropdown);
					// MarketDropdwn.selectByValue(");

		List<WebElement> Options = MarketDropdwn.getOptions();

		int count = Options.size();
		System.out.println(count  +" count of locations");
		
		for (int i = 1; i <= count; i++)
		{
			 MarketDropdwn.selectByIndex(i);
			
			  WebElement SetLocation = driver.findElement(By.xpath("//button[@class='button']"));
			 SetLocation.click();
			 Thread.sleep(1000);
		WebElement actualTitle = driver.findElement(By.xpath("//h1[@class='page-header-title']"));
		String ActTitle = actualTitle.getText();
		//System.out.println(actualTitle);
		if(ActTitle.equals("Events") || ActTitle.equals("Upcoming Events") || ActTitle.equals(null))
		{
			System.out.println("Event page is successfully opened");
		}
		else
		{
			System.out.println("Event page is not opened");
		}
		
		 WebElement noEventOption = driver.findElement(By.xpath("//h2[contains(text(),'No events are currently scheduled for this market')]"));
		  String noEvent = noEventOption.getText();
		if(noEvent.equals("No events are currently scheduled for this market"))
		{
			System.out.println("Market does not contain any Event");
			WebElement changeLocation = driver.findElement(By.linkText("Change Location" ));
			changeLocation.click();
		}
		
		 
		WebElement upcomingEventOption= driver.findElement(By.xpath("//h2[contains(text(),'Upcoming Events near you')]"));
		  String upcomingEvent= upcomingEventOption.getText();
	 if(upcomingEvent.equals("Upcoming Events near you"))
		{
			System.out.println("Market contain upcoming Event");
			
			WebElement viewEvent = driver.findElement(By.linkText("View this event"));
			viewEvent.click();
			if(communityInformation.equals("Community Information") )
			{
				System.out.println("Event detail page is opened successfully");
			}
		}
		}
		
		}
}
		
	
		
		
	      

		
			
     
		