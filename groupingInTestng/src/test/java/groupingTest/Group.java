package groupingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Group extends BaseClass{

	public WebDriver driver;
    
	
	//@BeforeTest(enabled=true)
	//@Parameters("browser")
    public void openDriver(String browser) {	 
		openBrowser(browser);
     }

    @Test(groups= {"sanity", "regression"})
	public void Test_01()
	{ 
    	System.out.println("I'm Test_01() method included the sanity and regression group");
  	}
    
    
    //@Test(groups= {"smoke", "regression"})
   	public void Test_02()
   	{ 
       	System.out.println("I am Test_02() method included the smoke and regression group");
        
   	}
  
    
    @Test(groups= {"regression"})
   	public void Test_03()
   	{ 
       	System.out.println("I am Test_03() method included the regression group");
        
   	}
  
    //@Test(groups= {"smoke"})
   	public void Test_04()
   	{ 
     	System.out.println("I am Test_04() method included the smoke only group");
     	  
   	}
  
    //@Test(groups= {"sanity"})
   	public void Test_05()
   	{ 
       	System.out.println("I am Test_05() method included the sanity only group");
           	  
   	}
  
    
    //@AfterTest(enabled=true)
    public void closeDriver() {	 
    	closeBrowser();
     }

    
}
