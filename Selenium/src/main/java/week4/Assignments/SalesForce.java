package week4.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password$123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> isWindowHandles = new ArrayList<String>(windowHandles);
		String secondisWindowHandle = isWindowHandles.get(1);
		driver.switchTo().window(secondisWindowHandle);
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		driver.findElement(By.xpath("//a[text()='Resources']")).click();
		driver.findElement(By.xpath("//span[text()='Learning']")).click();
		WebElement learning = driver.findElement(By.xpath("//span[text()='Learning on Trailhead']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(learning).perform();

	}

}
