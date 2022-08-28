package week7.pages;

import org.openqa.selenium.By;

import week7.base.ProjectSpecificMethod;

public class FIndLead extends ProjectSpecificMethod{
	
	
	public void enterLeadID(String findleadId) {
		
	getDriver().findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(findleadId);
}

}
