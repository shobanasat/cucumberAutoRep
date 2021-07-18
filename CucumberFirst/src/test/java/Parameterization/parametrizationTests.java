package Parameterization;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/test/resources/Parameterization/"},
		glue= {"Parameterization"},
	
plugin= {"pretty",
		"html:target/parameterization-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class parametrizationTests {

}
