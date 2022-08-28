package week7.pages;

import java.io.IOException;

import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import week7.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	

//	public void enterUsername(String username) {
	public LoginPage enterUsername(String uName) throws IOException {
		try {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		reportStep(uName+" username is entered successfully","pass");
		}catch(Exception e) {
			reportStep(uName+" username is not entered successfully"+e,"fail");
		}
		return this;
	}
	
//	@And ("Type the password as {string}")
//	public void enterPassword(String password) {
	public LoginPage enterPassword(String password) throws IOException {
		try {
		getDriver().findElement(By.id("password")).sendKeys(password);
		reportStep(password+" password is entered successfully","pass");
		}catch(Exception e) {
			reportStep(password+" password is not entered successfully"+e,"fail");
		}
		return this;
	}
	
//	@When ("Click the login button")
	public HomePage clickLogin() throws IOException {
		try {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		reportStep("Login button is successfully","pass");
		}catch(Exception e) {
			reportStep("Login button is not entered successfully"+e,"fail");
		}
		return new HomePage();
	}

}
