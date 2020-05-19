package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "C:\\Users\\ramya\\eclipse-workspace\\javalearning\\FreeCRM_BDDFramework\\src\\main\\java\\features\\login.feature", // path of the feature files
		
		glue = {"stepDefinitions"},  // path of the step definition files
		
		plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // different types of cucumber reports - html, json, xml
		
		dryRun = false, // to check the mapper is proper between feature files and step def files
		
		strict = true, // to check if any step is not defined in step def class
		
		monochrome = true // to display the console out in proper readable format
		
		)
	
public class TestRunner {
	
	
}
