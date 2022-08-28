package week7.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

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
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public String testName, testDescription, testAuthor, testCategory; 
	node;  // if using two setof input and getting separate report
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		//reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}
	
	@BeforeClass
	public void testCaseDetail() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testAuthor);
		test.assignAuthor(testCategory);

	}

	public int takeSnap() throws IOException {
		int ranNum = (int)(Math.random()*999999+1000000);
		
		File source = getDriver().getScreenshotAs(OutputType.FILE);
		File target = new File("./snap/img"+ranNum+".png");
		FileUtils.copyFile(source, target);
		
		return ranNum;

	}
	
	public void reportStep(String stepDesc, String status) throws IOException {
		
		int ranNum = takeSnap(); 
		
		MediaEntityModelProvider img= null;
		try {
		img = MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+ranNum+".png").build();
		}
		catch(IOException e) {
			
		}
		
		if(status.equalsIgnoreCase("pass")) {
			node.pass(stepDesc, img);
		}else if (status.equalsIgnoreCase("fail")) {
			node.fail(stepDesc, img);
			throw new RuntimeException("Look into the report for more details");
		}
	}
	
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
	
	@DataProvider (name="fetch",indices = {0})
	public String[][] fetchData() throws IOException {
		String [][] data =ReadData.readData(excelFileName);
		return data;
	}
	
	@BeforeMethod
		public void launchBrowser() {
		
		node = test.createNode(testName);
		
		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();

		//To initialise the Driver
		setDriver();
		
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
	}

	@AfterMethod
	public void closeBroweser() {
	//	getDriver().close();
	}
}
