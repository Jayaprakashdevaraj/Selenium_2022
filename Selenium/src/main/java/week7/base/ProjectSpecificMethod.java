package week7.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ProjectSpecificMethod {
	
	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();
	
	//setter method for driver
	public static void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	
	//get method for driver
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	
//	public static ChromeDriver driver;
	public String excelFileName ="";
	
	@DataProvider (name="fetch",indices = {0})
	public String[][] fetchData() throws IOException {
		String [][] data =ReadData.readData(excelFileName);
		return data;
	}
	
	@BeforeMethod
		public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();

		//To initialise the Driver
		setDriver();
		
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
	}

	@AfterMethod
	public void closeBroweser() {
		getDriver().close();
	}
}
