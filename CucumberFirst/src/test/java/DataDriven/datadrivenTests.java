package DataDriven;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/test/resources/DataDriven/"},
		glue= {"DataDriven"},
	
plugin= {"pretty",
		"html:target/datadriven-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class datadrivenTests {

}
