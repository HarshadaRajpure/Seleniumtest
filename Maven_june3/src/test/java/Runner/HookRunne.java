package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature/demo.feature",glue="stepDefination",dryRun=false,tags="@smoke",
					plugin = {"pretty","html:target/cucumber-reports/report1.html"})
public class HookRunne {

}
