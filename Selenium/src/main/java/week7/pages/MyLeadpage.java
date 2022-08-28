package week7.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import week7.base.ProjectSpecificMethod;

public class MyLeadpage extends ProjectSpecificMethod{
	
	@And("Click createlead link")
	public CreateLead clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
	public void clickFindLead() {
		getDriver().findElement(By.linkText("Find Leads")).click();
	}
	public void clickMergeLead() {
		getDriver().findElement(By.linkText("Merge Leads")).click();		
	}

}
