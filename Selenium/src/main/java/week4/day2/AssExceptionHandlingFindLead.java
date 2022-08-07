package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssExceptionHandlingFindLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Merge Leads")).click();
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> isWindowHandles = new ArrayList<String>(windowHandles);
		String secondisWindowHandle = isWindowHandles.get(1);
		driver.switchTo().window(secondisWindowHandle);
		System.out.println("Second Window Title " +driver.getTitle());
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Babu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		
		
		try {
			WebElement element = driver.findElement(By.xpath("(//a[@class='linktext'])[1]"));
			element.click();
		}catch (StaleElementReferenceException e) { 
			System.out.println("fail due to staleness of the element");
			driver.findElement(By.xpath("//a[@class='linktext'])[1]")).click();
		} catch (Exception e2) {
			System.out.println("Stopped brecause of Fail");
		}


		
		
	}

}
