package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
	// Switch to frame-1
		driver.switchTo().frame(0);
		driver.findElement(By.id("click")).click();
		
	//Switch to nested frame
		//Switch to parent frame2
		WebElement parentframe = driver.findElement(By.xpath("iframe[@sre='page.html"));
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("click1")).click();
		driver.switchTo().defaultContent();


	}
}