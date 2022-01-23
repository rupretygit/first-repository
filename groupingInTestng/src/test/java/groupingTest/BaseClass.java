package groupingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

    public WebDriver driver;
    
    public void openBrowser(String browser) {	
		
		if (browser.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");  	 
		    driver = new ChromeDriver();	  
			 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		    driver.get("https://www.google.com"); 
		 }
	}
	
	
    public void closeBrowser() {	 
      driver.close();
     }

}
