Feature: feature1
  Background:
    Given the user on the login page
    And the user open login form
    Then showed fields <login>, <password> and <SSO with Google>

  Scenario: Successful manual login
    When the user enters their username to the field <login>
    And the user enters valid  password to the field <password>
    And the user clicks the <login> button
    Then the user is redirected to the home page

  Scenario:  Successful SSO login
    When the user clicks SSO with Google <G> button
    And in the window that appeared, the user clicked on their Google account
    Then the user is redirected to the home page

  Scenario: Unsuccessful manual login - wrong username
    When the user enters incorrect username to the field <login>
    And the user enters valid  password to the field <password>
    And the user clicks the <login> button
    Then the error massage come: "ERROR: Login or password is incorrect"

  Scenario: Unsuccessful manual login - wrong password
    When the user enters their username to the field <login>
    And the user enters invalid  password to the field <password>
    And the user clicks the <login> button
    Then the error massage come: "ERROR: Login or password is incorrect"