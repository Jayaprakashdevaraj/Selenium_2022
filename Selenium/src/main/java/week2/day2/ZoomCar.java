package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='placeholder']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bangalore International Airport']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ride-time']//a)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class = 'table'])[1]//tbody/tr[4]/td[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class = 'table'])[1]//tbody/tr[4]/td[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class = 'button-primary'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class ='button-primary']")).click();
		Thread.sleep(2000);
		
		

	}

}
