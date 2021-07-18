package MultipleStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		
		features= {"src/test/resources/MultipleStepDef/"},
		glue= {"MultipleStepDef"},
	
plugin= {"pretty",
		"html:target/multiplestepdef-cucumber-htmlreport",
		"json:target/cucumber-report.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
)

public class multipleStepDefTests {

}
