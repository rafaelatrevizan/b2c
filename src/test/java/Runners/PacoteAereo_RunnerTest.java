package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\Laercio\\Documents\\Automação\\Infotera-B2C\\resource\\Features",
		glue = "steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report-json"},
		monochrome = false,		
		dryRun = false,
		strict = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@reservarPacoteAereo"}
		)

public class PacoteAereo_RunnerTest {}

