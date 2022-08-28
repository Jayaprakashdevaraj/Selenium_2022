package week7.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week7.base.ProjectSpecificMethod;
import week7.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setup() {
		excelFileName ="createLead";
		testName = "CreaeLead";
		testDescription = "Create lead with mandatory value";
		testAuthor = "JP";
		testCategory = "Functional";

	}
	
	@Test(dataProvider = "fetch")
	public void createNewLead(String username, String password, String companyName, String firstName, String lastName) throws IOException {
		
		LoginPage lp = new LoginPage(); 
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeadTab()
		.clickCreateLead()
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.typeCompanyName(companyName)
		.clickCreateLeadButton()
		.viewLeadPage();

	}

}
