package scenarious;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("the user on the login page")
    public void loginPage(){
        System.out.println("Background: Login page");
    }

    @When("Valid username")
    public void validLogin(){
        System.out.println("Scenario: Successful manual login / Step: Valid username");
    }

    @And("Valid password")
    public void validPassword(){
        System.out.println("Scenario: Successful manual login / Step: Valid password");
    }

    @And("Click Login button")
    public void clickLoginButton(){
        System.out.println("Scenario: Successful manual login / Step: click Login button");
    }

    @Then("Redirect to the home page")
    public void redirectToHomePage(){
        System.out.println("Scenario: Successful manual login / Step: redirect to the home page");
    }

}
