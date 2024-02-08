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
    @When("the user enters their username to the field <login>")
    public void validLogin(){
        System.out.println("Scenario: the user enters their username to the field <login>");
    }

    @And("the user enters valid  password to the field <password>")
    public void validPassword(){
        System.out.println("Scenario: the user enters valid  password to the field <password>");
    }

    @And("the user clicks the <login> button")
    public void clickLoginButtonDuringManualLogin(){
        System.out.println("the user clicks the <login> button");
    }

    @Then("the user is redirected to the home page")
    public void redirectToHomePageAfterManualLogin(){
        System.out.println("the user is redirected to the home page");
    }


    // Scenario:  Successful SSO login
    @When("the user clicks SSO with Google <G> button")
    public void userClicksSsoWithGoogle() {System.out.println("the user clicks SSO with Google <G> button");}

    @And("in the window that appeared, the user clicked on their Google account")
    public void userClicksTheirGoogleAcc() {System.out.println("in the window that appeared, the user clicked on their Google account");}

    @Then("the user is redirected to the home page")
    public void userRedirectToHomePAgeAfterSso() {System.out.println("the user is redirected to the home page");}


    //  Scenario: Unsuccessful manual login - wrong username
    @When("the user enters incorrect username to the field <login>")
    public void userEntersIncorrectUsernameDuringSso() {System.out.println("the user enters incorrect username to the field <login>");}

    @And("the user enters valid  password to the field <password>")
    public void userEntersValidPasswordDuringSso() {System.out.println("the user enters valid  password to the field <password>");}

    @And("the user clicks the <login> button")
    public void userClicksLoginButtonDuringSsoVar1() {System.out.println("the user clicks the <login> button");}

    @Then("the error massage come: \"ERROR: Login or password is incorrect\"")
    public void errorMessageAfterSsoWithWrongLogin() {System.out.println("the error massage come: \"ERROR: Login or password is incorrect\"");}


    //  Scenario: Unsuccessful manual login - wrong password
    @When("the user enters their username to the field <login>")
    public void userEntersValidUsernameDuringSso() {System.out.println("the user enters their username to the field <login>");}

    @And("the user enters invalid  password to the field <password>")
    public void userEntersIncorrectPasswordDuringSso() {System.out.println("the user enters invalid  password to the field <password>");}

    @And("the user clicks the <login> button")
    public void userClicksLoginButtonDuringSsoVar2() {System.out.println("the user clicks the <login> button");}

    @Then("the error massage come: \"ERROR: Login or password is incorrect\"")
    public void errorMessageAfterSsoWithWrongPassword() {System.out.println("the error massage come: \"ERROR: Login or password is incorrect\"");}
}
