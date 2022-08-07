package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDrag {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
	    System.out.println("Before drop position "+drag.getLocation());
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 100, 50).perform();
		System.out.println("After drop position "+drag.getLocation());
	}

}
