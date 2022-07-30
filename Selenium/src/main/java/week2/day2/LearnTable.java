package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://erail.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);
		
	}

}
