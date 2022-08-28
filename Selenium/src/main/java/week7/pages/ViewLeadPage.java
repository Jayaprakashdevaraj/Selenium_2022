package week7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import week7.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	
	@Then("verify the view leads page")
	public ViewLeadPage viewLeadPage() {
		String actViewleadTitle = getDriver().getTitle();
		Assert.assertEquals(actViewleadTitle, "View Lead | opentaps CRM");
		return this;
	}
	
	public void clickDuplicateLeadButton() {
		getDriver().findElement(By.linkText("Duplicate Lead")).click();
	}
	
	public void clickEditLeadButton() {
		getDriver().findElement(By.linkText("Edit")).click();
	}
	
	public void clickDeleteLeadButton() {
		getDriver().findElement(By.linkText("Delete")).click();
	}
	
	public void veriftFirstName(String verifyFname) {
		WebElement fName = getDriver().findElement(By.xpath("//span[text()='First name']/following::span"));
		Assert.assertEquals(verifyFname, fName);
	}
	
	public void veriftCompanyName(String verifyCname) {
		WebElement cName = getDriver().findElement(By.xpath("//span[text()='Company Name']/following::span"));
		Assert.assertEquals(verifyCname, cName);
	}
	
}
