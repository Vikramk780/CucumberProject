package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

public class ApplicationHooks {
	
	private WebDriver driver;	

	private ConfigReader configReader;
	Properties prop;
	DriverFactory driverFactory;
	
	
	
	
	@Before(order = 0)
	public void getProperties() {
		
		configReader = new ConfigReader();
		
		prop=configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		String BrowserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(BrowserName);	
	}
	
	
	
	
	@After(order = 0)
	public void quit() {
		driver.quit();
	}
	

	
	
}
