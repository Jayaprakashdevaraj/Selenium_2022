package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.ProjectSpecificMethod;

@CucumberOptions(features="src/test/java/features",
				glue ={"steps","hook"},
				monochrome =true,
				publish= true,
				tags ="@create") // like grouping
public class RunCucumberTest extends ProjectSpecificMethod {

}
