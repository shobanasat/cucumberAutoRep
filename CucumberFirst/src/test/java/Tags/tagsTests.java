package Tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=false,
		
		tags= "@Regression",
		features= {"src/test/resources/Tags/"},
		glue= {"Tags"},
		
	
plugin= {"pretty",
		"html:target/tags-cucumber-htmlreport",
		"json:target/cucumber-report.json",
}
)

public class tagsTests {

}
