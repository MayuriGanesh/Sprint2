package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features= {".\\src\\test\\java\\Features"},
glue="Stepdefination",

dryRun=true,

monochrome=true,


plugin= {
		"pretty", "html:target/HTMLReport/report.html"
		
		} 
	)
public class RunnerClass extends AbstractTestNGCucumberTests {

}


