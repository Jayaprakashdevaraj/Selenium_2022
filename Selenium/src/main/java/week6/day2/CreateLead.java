package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead extends ProjectSpecific {
	
	@DataProvider(name="smoke")
	public String[][] fetchData() {
		String[][] data = new String[2][3];
		data[0][0] = "Infosys";
		data[0][1] = "Jayaprakash";
		data[0][2] = "Devaraj";
		
		data[1][0] = "Apple";
		data[1][1] = "Jaya";
		data[1][2] = "Prakash";
		
		return data;
	}
	
	@Test(dataProvider = "smoke", retryAnalyzer = RetryFailedcase.class)
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
/*		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not correct");
		}
*/		
		//Hard assert
	//	Assert.assertEquals(title, "View Lead | opentaps CRM");
	
		//SoftAssert
		SoftAssert assertion = new SoftAssert();
	assertion.assertEquals(title,"View Lead | opentaps CRM");
	
	}


}
