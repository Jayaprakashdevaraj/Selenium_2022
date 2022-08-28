package week7.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import week7.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	
	public void verifyHomePage() {
		String actTitle = getDriver().getTitle();
		Assert.assertEquals(actTitle, "Leaftaps - TestLeaf Automation Platform");
	}
	
	
///	@Given ("Click CRMSFA link")
	public MyHomePage clickCrmsfa() {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			return new MyHomePage();
	}

}
