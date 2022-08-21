package pages;

import org.openqa.selenium.By;

public class HomePage extends ProjectSpecificMethod {
	public void clickCrmsfa() {
			driver.findElement(By.className("decorativeSubmit")).click();
	}

}
