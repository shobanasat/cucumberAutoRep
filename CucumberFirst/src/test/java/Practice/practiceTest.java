package Practice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/test/resources/Practice/"},
		glue= {"Practice"},
	
plugin= {"pretty",
		"html:target/practice-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class practiceTest {

}
