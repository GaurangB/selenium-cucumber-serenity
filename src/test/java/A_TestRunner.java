import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
                    glue = {"stepdefs"},
                    format = {"html:target/Selenium-Automation.html"},
                    snippets = SnippetType.CAMELCASE,
                    tags = "@regression",
                    plugin = {"rerun:target/rerun.txt"}
                )

public class A_TestRunner {
}
