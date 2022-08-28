package week7.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import week7.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	
	@And ("click Lead tab")
	public MyLeadpage clickLeadTab() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadpage();
	}

}
