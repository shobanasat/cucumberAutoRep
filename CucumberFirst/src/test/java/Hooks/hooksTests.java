package Hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		
		//tags= "@Regression",
		features= {"src/test/resources/Hooks/"},
		glue= {"Hooks"},
		
	
plugin= {"pretty",
		"html:target/hooks-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class hooksTests {

}
