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

import Ecommerce.configuration.ReadConfiguration;



public class SimpleBaseClass {
	 public static WebDriver driver;
		public static Logger logger;
		//ReadConfiguration readconfig = new ReadConfiguration();
		//public String BaseURL = readconfig.getApplicationURL();
		//public String Username =readconfig.Username();
		//public String Password =readconfig.Password();

     @BeforeMethod
	public void SimpleBaseClass() {
    	//System.setProperty("Webdriver chrome driver ",readconfig.GetChromepath());

		System.setProperty("Webdriver chrome driver", "\"C:\\chromedriver.exe\\");
		
		driver =new ChromeDriver();
		logger = logger.getLogger("11MarchMaven_project");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/login");
	//	driver.get(BaseURL);
		//driver.get("https://demo.nopcommerce.com/");
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
	
	

}
