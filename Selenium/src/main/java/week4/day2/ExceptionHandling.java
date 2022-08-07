package week4.day2;

import java.time.Duration;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Lead")).click();
		driver.findElement(By.linkText("Find Lead")).click();
		

		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Babu");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
		
		
		WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
		
		try {
		element.click();
		}catch (StaleElementReferenceException e) { 
			System.out.println("fail due to staleness of the element");
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		} catch (ElementClickInterceptedException e1) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"))));
			element.click(); 
		}catch (WebDriverException e2) {
			throw new RuntimeException("Stopped brecause of Fail");
		}


		
		
	}

}
