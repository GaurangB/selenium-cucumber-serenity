import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "@target/rerun.txt" },
        plugin = { "pretty","html:target/report/rerun/html-basic",
                "json:target/report/rerun/cucumber.json" },
        glue = { "stepdefs" }
)
public class B_RerunTest {

}