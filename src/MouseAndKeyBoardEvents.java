import org.apache.poi.xssf.usermodel.examples.ShiftRows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class MouseAndKeyBoardEvents {
    @Test(enabled = false)
	public void MouseEvent() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://demo.guru99.com/test/newtours");
    	WebElement Link_text = driver.findElement(By.linkText("Home"));
    	WebElement HomeBackColor = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
    	
    	Actions act = new Actions(driver);
    	Action MouseHover = act.moveToElement(Link_text).build();
    	
    	String BgColor = HomeBackColor.getCssValue("background-color");
    	System.out.println("Before Hover " +BgColor);
    	MouseHover.perform();
    	
        BgColor = HomeBackColor.getCssValue("background-color");
        System.out.println("After Hover " +BgColor);
    	driver.close();
    	
    }
    	@Test
        public void AllActions() {
    		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
        	WebDriver driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("https://www.facebook.com");
        	WebElement Email = driver.findElement(By.id("email"));
        	Actions act = new Actions(driver);
        	act.moveToElement(Email).click()
        	.keyDown(Email,Keys.SHIFT).
        	sendKeys("Hello").
        	keyUp(Email, Keys.SHIFT)
        	.doubleClick().contextClick().
        	perform();
        	
        	driver.quit();
        	
        	
        }
        
    	
		
	}

