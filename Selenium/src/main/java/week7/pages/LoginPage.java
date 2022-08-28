package week7.pages;

import org.openqa.selenium.By;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import week7.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	

//	public void enterUsername(String username) {
	public LoginPage enterUsername(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	
//	@And ("Type the password as {string}")
//	public void enterPassword(String password) {
	public LoginPage enterPassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
//	@When ("Click the login button")
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
