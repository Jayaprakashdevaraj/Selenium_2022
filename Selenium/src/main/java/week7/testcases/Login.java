package week7.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import week7.base.ProjectSpecificMethod;
import week7.pages.LoginPage;

public class Login extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setup() {
		excelFileName ="Login";
		testName = "Login";
		testDescription = "Verify the login functionality with positive data";
		testAuthor = "Jayaprakash";
		testCategory = "Smoke";
	}

	@Test(dataProvider = "fetch")
	public void runLogin(String username, String password) throws IOException {
		LoginPage lp = new LoginPage();
		
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage();
		
	}
}
