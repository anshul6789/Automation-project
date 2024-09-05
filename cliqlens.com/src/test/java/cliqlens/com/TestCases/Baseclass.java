package cliqlens.com.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {
public static WebDriver driver;
	
	@BeforeClass
		public void setup()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MVS-Designer\\eclipse-workspace\\cliqlens.com\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://velvetresidences.mvslab.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
