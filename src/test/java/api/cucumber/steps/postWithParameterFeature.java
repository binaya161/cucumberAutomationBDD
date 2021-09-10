package api.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class postWithParameterFeature {
    @When("I type the message as \"My Post\"in the text box")
    public void i_type_the_message_as_my_post_in_the_text_box() {
        System.out.println ("My Post");

    }


    @When("click on Post button")
    public void click_on_post_button() {
        System.out.println ( "click on Post button");
    }
    @Then("the message should be get posted")
    public void the_message_should_be_get_posted() {
        System.out.println ( "the message should be get posted");
    }
    @When("User supply the youtube link as {string} in the text box")
    public void user_supply_the_youtube_link_as_in_the_text_box(String text) {
        System.out.println (text);
    }




    @When("Click on post button1")
    public void click_on_post_button1() {
        System.out.println ("Click on post button1");
    }
    @Then("Video should get posted on the user wall")
    public void video_should_get_posted_on_the_user_wall() {
        System.out.println ("Video should get posted on the user wall");
    }
    @Then("the video should have proper thumbnail.")
    public void the_video_should_have_proper_thumbnail() {
        System.out.println ("the video should have proper thumbnail.");

    }
}
