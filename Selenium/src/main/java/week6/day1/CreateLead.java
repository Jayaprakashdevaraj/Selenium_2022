package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecific {
	
	
	@Test(invocationCount = 2, timeOut = 1000)
	public void createNewLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaprakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not correct");
		}
			
	}


}
