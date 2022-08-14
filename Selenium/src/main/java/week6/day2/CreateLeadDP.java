package week6.day2;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadDP extends ProjectSpecific {
	
	@BeforeTest
	public void setup() {
		excelFilename="CreateLead";
	}
	
	@Test(dataProvider = "smoke")
	public void createNewLead(String company, String fName, String lName) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
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
