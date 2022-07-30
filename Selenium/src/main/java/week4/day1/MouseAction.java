package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver =new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			//Close X button===✕
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
			
			Actions builder = new Actions(driver);
			builder.moveToElement(electronics).perform();
	}

}
