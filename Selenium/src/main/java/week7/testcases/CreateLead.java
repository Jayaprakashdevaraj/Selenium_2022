package week7.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week7.base.ProjectSpecificMethod;
import week7.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setup() {
		excelFileName ="createLead";
	}
	
	@Test(dataProvider = "fetch")
	public void createNewLead(String username, String password, String companyName, String firstName, String lastName) {
		
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
