package week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftabWindowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text() ='Merge Contacts']")).click();
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> isWindowHandles = new ArrayList<String>(windowHandles);
		String secondisWindowHandle = isWindowHandles.get(1);
		driver.switchTo().window(secondisWindowHandle);
		String secondWindowTitle = driver.getTitle();
		System.out.println("Second window title is "+secondWindowTitle);
	
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		
		String parentisWindowHandle = isWindowHandles.get(0);
		driver.switchTo().window(parentisWindowHandle);
		String parentWindowTitle = driver.getTitle();
		System.out.println("Parent window title is "+parentWindowTitle);
	
		driver.findElement(By.xpath("//a[text() ='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String mergeTitle = driver.getTitle();
		System.out.println("After merge page title is "+mergeTitle);
	
	}

}
