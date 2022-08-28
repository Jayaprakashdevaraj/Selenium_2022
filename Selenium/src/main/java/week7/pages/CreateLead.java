package week7.pages;

import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import week7.base.ProjectSpecificMethod;


public class CreateLead extends ProjectSpecificMethod{
	
//	@When("Type company name as (.*)$")
	public CreateLead typeCompanyName(String companyName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			return this;
	}

	
//	@And("Type firstname as (.*)$")
	public CreateLead typeFirstName(String firstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}

//	@And("Type lastname as (.*)$")
	public CreateLead typeLastName(String lastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);		
		return this;
	}

//	@And("click the Create Lead Button")
	public ViewLeadPage clickCreateLeadButton() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();	
	}


}
