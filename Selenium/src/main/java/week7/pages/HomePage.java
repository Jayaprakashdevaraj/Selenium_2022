package week7.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import week7.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public void verifyHomePage() throws IOException {
		try {
		String actTitle = getDriver().getTitle();
		Assert.assertEquals(actTitle, "Leaftaps - TestLeaf Automation Platform");
		reportStep("homepage viewed successfully","pass");
		}catch(Exception e) {
			reportStep("homepage viewed is not viewed successfully"+e,"fail");
		}
	}
	
	
///	@Given ("Click CRMSFA link")
	public MyHomePage clickCrmsfa() {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			return new MyHomePage();
	}

}
