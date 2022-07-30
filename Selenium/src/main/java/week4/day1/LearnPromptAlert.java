package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPromptAlert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
		String result = driver.findElement(By.xpath("//button[text()='Prompt Box']//following-sibling::p")).getText();
		System.out.println(result);
		
		
		
	}
}
