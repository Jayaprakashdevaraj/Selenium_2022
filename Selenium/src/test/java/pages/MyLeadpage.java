package pages;

import org.openqa.selenium.By;

public class MyLeadpage extends ProjectSpecificMethod{
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();		
	}

}
