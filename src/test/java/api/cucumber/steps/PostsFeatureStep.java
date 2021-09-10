package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostsFeatureStep {
    @Given("user should be loged in and should be present at its own wall")
    public void user_should_be_loged_in_and_should_be_present_at_its_own_wall() {
        System.out.println ("user should be loged in and should be present at its own wall");
    }
    @When("I type the message in the text box")
    public void i_type_the_message_in_the_text_box() {
        System.out.println ("I type the message in the text box" );
    }
    @When("click on Post buttons")
    public void click_on_post_buttons() {
        System.out.println ("click on Post buttons");
    }
    @Then("the message should get posted")
    public void the_message_should_get_posted() {
        System.out.println ("the message should get posted");
    }




    @Given("user should be logged in and should be present at its own wall")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() {
        System.out.println ("user should be logged in and should be present at its own wall");
    }
    @When("User supply the youtube link in the text box")
    public void user_supply_the_youtube_link_in_the_text_box() {
        System.out.println ("User supply the youtube link in the text box");
    }
    @When("Click on post button")
    public void click_on_post_button() {
        System.out.println ("Click on post button" );
    }
    @Then("Video should get posted the user wall")
    public void video_should_get_posted_the_user_wall() {
        System.out.println ("Video should get posted the user wall");
    }
    @Then("the video should have proper thumbnail")
    public void the_video_should_have_proper_thumbnail() {
        System.out.println ("the video should have proper thumbnail");

    }

}
