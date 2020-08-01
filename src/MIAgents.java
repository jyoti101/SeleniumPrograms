

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

	public class MIAgents { 
		@Test
			public void MIHomesPage() throws InterruptedException 
			{		
				System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.mihomes.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[contains(text(),'Agent Information')]")).click();
					
				  	WebElement dropdown = driver.findElement(By.xpath("//select[@id='marketId']"));
					dropdown.click();
					 Select MarketDropdwn = new Select(dropdown);
					 MarketDropdwn.selectByIndex(1);

					 WebElement SetLocation = driver.findElement(By.xpath("//button[@class='button']"));
					 SetLocation.click();
					 Thread.sleep(1000);
					 WebElement ClientConnect = driver.findElement(By.xpath("//a[contains(text(),'Client Connect')]"));
				      ClientConnect.click();
			
					
					WebElement ConnectYourClient = driver.findElement(By.xpath("//h2[contains(text(),'Connect Your Clients.')]"));
					String ConnectClientText= ConnectYourClient.getText();
					WebElement ConnectHomeBuyer = driver.findElement(By.xpath("//h2[contains(text(),'Connect your home buyer with M')]"));
				  String ConnectHomeBuyerText =	ConnectHomeBuyer.getText();
				
					if(ConnectClientText.equals("Connect Your Clients.") && (ConnectHomeBuyerText.equals("Connect your home buyer with M/I Homes")))
					{
						System.out.println("Page has been succesfully navigated to Client-Connect page");
					}
					else
					{
						System.out.println("Page is not navigated to client connect page");
					}
					
				driver.quit();	
}
	}
