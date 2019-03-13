package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

import static org.junit.Assert.fail;

public class SampleSteps extends ScenarioSteps {

    HomePage homePage;

    @Given("^I like an apple$")
    public void iLikeAnApple() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnSomething();
    }


    @When("^I see an apple$")
    public void iSeeAnApple() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the apple disappears$")
    public void theAppleDisappears() {
        // Write code here that turns the phrase above into concrete actions
    }
}
