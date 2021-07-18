package Background;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/test/resources/Background/"},
		glue= {"Background"},
	
plugin= {"pretty",
		"html:target/background-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class backgroundTests {

}
