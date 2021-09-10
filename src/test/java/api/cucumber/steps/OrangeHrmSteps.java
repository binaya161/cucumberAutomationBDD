package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmSteps {
    @Given("I want to go home")
    public void I_want_to_go_home() {
        System.out.println ("I launch chrome browser");
    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        System.out.println ("I open orange hrm homepage");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        System.out.println ( "I verify that the logo present on page");
    }

    @Then("close browser")
    public void close_browser() {
        System.out.println ("close browser");;
    }
}
