package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitsWindowappear {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text() ='Wait for 5 seconds']")).click();
		
		//Explicitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		if(until) {
			System.out.println("Pass : 3 windows appeared in 10Sec");
		}else
			System.out.println("Fail :3 windows didnot in 10Sec");
	}

}
