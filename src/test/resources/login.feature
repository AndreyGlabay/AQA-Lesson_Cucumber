Feature: feature1
  Background:
    Given the user on the login page
    And the user open login form
    Then showed fields <login>, <password> and <SSO with Google>

  Scenario: Successful manual login
    When the user enters their username to the field <login> during manual login
    And the user enters valid  password to the field <password> during manual login
    And the user clicks the <login> button after entering valid username and valid password
    Then the user is redirected to the home page after manual login

  Scenario:  Successful SSO login
    When the user clicks SSO with Google <Google_logo> button
    And in the window that appeared, the user clicked on their Google account
    Then the user is redirected to the home page after SSO

  Scenario: Unsuccessful manual login - wrong username
    When the user enters incorrect username to the field <login>
    And the user enters valid  password to the field <password>
    And the user clicks the <login> button after entering invalid username and valid password
    Then the error message for wrong username comes: "ERROR: Login or password is incorrect"

  Scenario: Unsuccessful manual login - wrong password
    When the user enters their username to the field <login>
    And the user enters invalid  password to the field <password>
    And the user clicks the <login> button after entering valid username and invalid password
    Then the error message for wrong password comes: "ERROR: Login or password is incorrect"