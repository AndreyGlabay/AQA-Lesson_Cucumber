package scenarious;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    // Background
    @Given("the user on the login page")
    public void userOnLoginPage(){
        System.out.println("Background: User on Login page");
    }

    @And("the user open login form")
    public void userOpenLoginForm(){ System.out.println("he user open login form");}

    @Then("showed fields <login>, <password> and <SSO with Google>")
    public void showedFields(){System.out.println("showed fields <login>, <password> and <SSO with Google>");}


    // Scenario: Successful manual login
    @When("the user enters their username to the field <login> during manual login")
    public void validLogin(){
        System.out.println("the user enters their username to the field <login> during manual login");
    }

    @And("the user enters valid  password to the field <password> during manual login")
    public void validPassword(){
        System.out.println("the user enters valid  password to the field <password> during manual login");
    }

    @And("the user clicks the <login> button after entering valid username and valid password")
    public void clickLoginButtonDuringManualLogin(){
        System.out.println("the user clicks the <login> button after entering valid username and valid password");
    }

    @Then("the user is redirected to the home page after manual login")
    public void redirectToHomePageAfterManualLogin(){
        System.out.println("the user is redirected to the home page after manual login");
    }


    // Scenario:  Successful SSO login
    @When("the user clicks SSO with Google <G> button")
    public void userClicksSsoWithGoogle() {System.out.println("the user clicks SSO with Google <G> button");}

    @And("in the window that appeared, the user clicked on their Google account")
    public void userClicksTheirGoogleAcc() {System.out.println("in the window that appeared, the user clicked on their Google account");}

    @Then("the user is redirected to the home page after SSO")
    public void userRedirectToHomePAgeAfterSso() {System.out.println("the user is redirected to the home page after SSO");}


    //  Scenario: Unsuccessful manual login - wrong username
    @When("the user enters incorrect username to the field <login>")
    public void userEntersIncorrectUsernameDuringSso() {System.out.println("the user enters incorrect username to the field <login>");}

    @And("the user enters valid  password to the field <password>")
    public void userEntersValidPasswordDuringSso() {System.out.println("the user enters valid  password to the field <password>");}

    @And("the user clicks the <login> button after entering invalid username and valid password")
    public void userClicksLoginButtonDuringSsoVar1() {System.out.println("tthe user clicks the <login> button after entering invalid username and valid password");}

    @Then("the error message for wrong username comes: \"ERROR: Login or password is incorrect\"")
    public void errorMessageAfterSsoWithWrongLogin() {System.out.println("the error message for wrong username comes: \"ERROR: Login or password is incorrect\"");}


    //  Scenario: Unsuccessful manual login - wrong password
    @When("the user enters their username to the field <login>")
    public void userEntersValidUsernameDuringSso() {System.out.println("the user enters their username to the field <login>");}

    @And("the user enters invalid  password to the field <password>")
    public void userEntersIncorrectPasswordDuringSso() {System.out.println("the user enters invalid  password to the field <password>");}

    @And("the user clicks the <login> button after entering valid username and invalid password")
    public void userClicksLoginButtonDuringSsoVar2() {System.out.println("the user clicks the <login> button after entering valid username and invalid password");}

    @Then("the error message for wrong password comes: \"ERROR: Login or password is incorrect\"")
    public void errorMessageAfterSsoWithWrongPassword() {System.out.println("the error message for wrong password comes: \"ERROR: Login or password is incorrect\"");}
}
