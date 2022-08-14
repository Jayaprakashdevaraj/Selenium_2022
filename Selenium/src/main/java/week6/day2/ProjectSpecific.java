package week6.day2;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecific {
	RemoteWebDriver driver;
	static WebDriverWait wait;
	String excelFilename;
	

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void setup(String url, String username, String password) {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	@DataProvider(name="smoke")
	public String[][] fetchData() throws IOException {
		String[][] data =ReadData.readData(excelFilename);
		return data;
	}

}
