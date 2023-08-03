package Com.ECommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import Ecommerce.Utilities.TestUtils;
import Ecommerce.configuration.ReadConfiguration;



public class BaseClass {
	
	public static  WebDriver driver;
	public static Logger logger;
	ReadConfiguration readconfig = new ReadConfiguration();
	public String BaseURL = readconfig.getApplicationURL();
	public String Username =readconfig.Username();
	public String Password =readconfig.Password();
	@Parameters("Browser")
	@BeforeMethod
	public void initialization(String Browsername) {
		System.setProperty("Webdriver chrome driver ",readconfig.GetChromepath());
		logger = logger.getLogger("11MarchMaven_project");
		PropertyConfigurator.configure("log4j.properties");
		if(Browsername.equals("Chrome")) {
			System.setProperty("Webdriver chrome driver ",readconfig.GetChromepath());
		driver = new  ChromeDriver();
		}
		else if(Browsername.equals("FireFox")) {
			System.setProperty("Webdriver gecko driver",readconfig.GetFirefox());
			driver =new FirefoxDriver();
		}
        logger.info("open Browser");
		driver.manage().window().maximize();
         logger.info("Maximize the browser");
          driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	//	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.get(BaseURL);
		logger.info("Open URL");
		
	}
	
	@AfterMethod
	public void Teardown () throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}



