package Datatable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		
		features= {"src/test/resources/Datatable/"},
		glue= {"Datatable"},
	
plugin= {"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class datatableTests {

}
