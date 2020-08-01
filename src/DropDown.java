


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void SelectDropdown() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
    Select CountryDropdown = new Select(driver.findElement(By.xpath(".//select[@name='country']")));
      
      if(CountryDropdown.isMultiple())
      {
      System.out.println("Select tag allows multiple selection");	
      }
      else
      {
      System.out.println("Select does not allow multiple selections");

      }
    CountryDropdown.selectByIndex(1);
      System.out.println("Option 1 is selected");
      Thread.sleep(1000);
	  CountryDropdown.selectByValue("CONGO");
	  Thread.sleep(2000);
	  
	  System.out.println("Congo is selected in dropdown");
	  
		/*
		 * CountryDropdown.deselectAll();
		 * System.out.println("All selection has been deselected now");
		 */
	  
	  Thread.sleep(2000);
    
}
}