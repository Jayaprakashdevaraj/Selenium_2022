package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
	
		//single alert
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Single Alert "+text);
		alert.dismiss();
		
		
		//Confirm Alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println("confirm Alert "+text2);
		alert2.accept();
		
		//Prompt
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		
		String result = driver.findElement(By.xpath("//button[text()='Prompt Box']//following-sibling::p")).getText();
		System.out.println(result);
		
	}
}
