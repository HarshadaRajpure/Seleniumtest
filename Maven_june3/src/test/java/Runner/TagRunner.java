package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature/Tags.feature",
				glue="stepDefination",
				dryRun = false,
				tags="@smoke",
				plugin = {"pretty","html:target/cucumber-reports/report.html"})
public class TagRunner {

}
