package hook;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import steps.ProjectSpecificMethod;

public class HookImp extends ProjectSpecificMethod{
	
/*	@Before    //@BeforeMethod
	public void beforeFeature() {
		System.out.println("This is run before feature");
	}

	@After  //@AfterMethod
	public void afterFeature() {
		System.out.println("This is run after feature");
	}
*/
	@BeforeStep
	public void beforeStep() {
		System.out.println("This is run before step");
	}

	@AfterStep
	public void takeSnap() throws IOException {
		//System.out.println("This is run after step");
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File loc = new File("./cucumberss/"+i+".img");
		FileUtils.copyFile(source, loc);
		i++;
	
	
	}
/*	
	@BeforeAll
	public static void beforeSuit() {
		System.out.println("This is run before suite");
	}

	@AfterAll
	public static void aftersuit() {
		System.out.println("This is run after suite");
	}
*/	
}
