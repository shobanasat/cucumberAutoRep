package MultipleScenarios;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		
		//tags= "@Regression",
		features= {"src/test/resources/MultipleScenarios/"},
		glue= {"MultipleScenarios"},
		
	
plugin= {"pretty",
		"html:target/multiplescenarios-cucumber-htmlreport",
		"json:target/cucumber-report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

public class multipleScenariosTests {

}
