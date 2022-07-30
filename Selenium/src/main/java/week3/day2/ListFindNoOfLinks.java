package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListFindNoOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//Get second link name
		WebElement secondLink = links.get(1);
		String text = secondLink.getText();
		System.out.println(text);
	}

}
