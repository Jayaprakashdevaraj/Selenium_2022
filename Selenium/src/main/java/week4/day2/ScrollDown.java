package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		//handle browser notifocation
				ChromeOptions options = new ChromeOptions();
				//Notification
				options.addArguments("--disable-notifcations");
				//headless-invisible
				options.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement footer = driver.findElement(By.xpath("(//div[@class='dib'])[2]"));
		
		Actions a = new Actions(driver);
		a.scrollToElement(footer).perform();
		
		 File source = driver.getScreenshotAs(OutputType.FILE); 
		 File dest = new File("snap1.png");
		 FileUtils.copyFile(source, dest);
		 
	}

}
