package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends ProjectSpecificMethod{
	
	
	
	@Given ("Type the username as {string}")
	public void typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	
	
	@And ("Type the password as {string}")
	public void typePasswors(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
}
	@When ("Click the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Verify the HomePage is displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if(text.contains("Welcome")) {
			System.out.println("Home page is displayed");
		}else {
			System.out.println("Home page is not displayed");
		}

	}
	
	@But ("Error message is displayed")
	public void verifyErrormsg() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);

	}


}
