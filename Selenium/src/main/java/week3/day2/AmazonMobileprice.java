package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobileprice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
	
		List<Integer> phonePrice = new ArrayList<Integer>();
		//	System.out.println(price.size());
		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText();
			text = text.replaceAll(",", "");
			System.out.println(text);
			int parseInt = Integer.parseInt(text);
			phonePrice.add(parseInt);
		}
		Collections.sort(phonePrice);
		
		System.out.println("Lower price is "+phonePrice.get(0));
		System.out.println("High price is "+phonePrice.get(phonePrice.size()-1));
		
	}

}
