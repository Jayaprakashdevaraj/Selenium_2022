package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.ProjectSpecificMethod;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
				glue ="steps",
				monochrome =true,
				publish= true)
public class RunCucumberTest extends ProjectSpecificMethod {

}
