package Sample;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.cli.Main;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/Sample/"},
		glue= {"Sample"},
	
plugin= {"pretty",
		"html:target/sample-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class firstFeatureTest {	
		
}
