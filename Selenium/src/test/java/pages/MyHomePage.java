package pages;

import org.openqa.selenium.By;

public class MyHomePage extends ProjectSpecificMethod{
	public void clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
