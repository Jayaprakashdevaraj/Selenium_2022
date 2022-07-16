package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaprakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("First name");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Test analyst at infosys");
		driver.findElement(By.name("primaryEmail")).sendKeys("jayaprakash1803@gmail.com");
			
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select = new Select(state);
		select.selectByVisibleText("California");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is correct = "+title);
		}else {
			System.out.println("Title is not correct = "+title);
		}
		
	}

}
