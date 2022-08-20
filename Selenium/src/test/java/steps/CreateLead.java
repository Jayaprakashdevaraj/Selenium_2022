package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ProjectSpecificMethod{
	
	
	
	

	
	
	
	@Given("Click CRMSFA link")
	public void clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	@And("click Lead tab")
	public void clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();

		
	}

	@And("Click createlead link")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Type company name as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			
	}

	
	@And("Type firstname as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

		
	}

	@And("Type lastname as (.*)$")
	public void typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);		
	}

	@And("click the Create Lead Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		
	}

	@Then("verify the view leads page")
	public void viewLeadPage() {
		String title = driver.getTitle();
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not correct");
		}
		
	}

}
