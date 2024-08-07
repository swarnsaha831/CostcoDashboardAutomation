package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/Feature",
	glue = "stepDefinitions",
	plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
	monochrome = true//, dryRun = true //: FOR HEADLESS BROWSERS
)

public class Runner extends AbstractTestNGCucumberTests{

}
