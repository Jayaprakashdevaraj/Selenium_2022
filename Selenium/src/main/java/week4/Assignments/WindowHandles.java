package week4.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

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
		
	/*	String secondWindowTitle = driver.getTitle();
		System.out.println("Second window title is "+secondWindowTitle);
	*/	
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		
		driver.switchTo().window(isWindowHandles.get(0));
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent window title is "+parentWindowTitle);
		
		

	}

}
