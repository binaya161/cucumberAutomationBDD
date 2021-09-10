package api.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithExampleStep {
    private WebDriver driver;

    @Given("User is on Home page")
    public void User_is_on_home_page() {
        WebDriverManager.chromedriver ( ).setup ( );
        driver = new ChromeDriver ( );
        driver.get ( "https://www.saucedemo.com/" );

    }

    @When("User Navigate to Login Page")
    public void User_navigate_to_login_page() {
        System.out.println ( "User Navigate to Login Page" );

    }

    @When("User enters {string} and {string}")
    public void User_enters_and(String username, String password) {
        System.out.println ( "User name is " + username + "password is " + password );
        driver.findElement ( By.xpath ( "//input[@id='user-name']" ) ).sendKeys ( username );
        driver.findElement ( By.xpath ( "//input[@id='password']" ) ).sendKeys ( password );
        driver.findElement ( By.xpath ( "//input[@id='login-button']" ) ).click ( );

    }

    @Then("^Message displayed Login Successfully$")
    public void Message_displayed_Login_Successfully() throws Throwable {
        System.out.println ( "Message displayed Login Successfully" );
        Thread.sleep ( 2000);
        driver.close ( );

    }
}

