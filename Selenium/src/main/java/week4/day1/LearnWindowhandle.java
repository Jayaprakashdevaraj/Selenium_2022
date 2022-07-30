package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		//print the window handle of the active browser/Tab
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.id("home")).click();
		
		//Now second window open need yo move it as well as need to know 2nd window name
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Total no of window "+windowHandles.size());
		
		//How can i get second from set?
		List<String> isWindowHandles = new ArrayList<String>(windowHandles);
		String secondisWindowHandle = isWindowHandles.get(1);
		System.out.println(secondisWindowHandle);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		// move to primary
		driver.switchTo().window(windowHandle);
		
		
	}

}
