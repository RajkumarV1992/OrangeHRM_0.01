package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featureFile", 
//@CucumberOptions(features="featureFile\\DataTableWithHeader.feature", 
				 glue="stepDefinitions",
				 dryRun=false,
				 plugin = { 
						   "pretty",                                // Prints readable console output
					       "html:target/cucumber-reports.html",     // ✅ HTML report
					       "json:target/cucumber.json"              // ✅ JSON report
				 },
				 
				 monochrome=true,
				Emp"
				 
				 
				 )

public class RunnerClass {

	
	
}
