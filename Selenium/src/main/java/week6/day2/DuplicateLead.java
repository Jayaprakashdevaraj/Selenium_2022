package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DuplicateLead extends ProjectSpecific{

	@Test(dependsOnMethods = "week6.day1.CreateLead.createNewLead")
	public void findDuplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub

	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Exela Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaprakash");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devaraj");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("First name");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Test analyst at infosys");
		driver.findElement(By.name("primaryEmail")).sendKeys("jayaprakash1803@gmail.com");

		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();

		String title1 = driver.getTitle();

		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayaprakash Devaraj");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		if(title1.equals("View Lead | opentaps CRM")) {
			if(title1.equals(title2)) {
				System.out.println("Title is correct = "+title1);
			}else {
				System.out.println("Title is not correct = "+title1);
			}

		}
	}
}
