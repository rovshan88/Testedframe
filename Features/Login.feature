Feature: Login
  Scenario: Successful Login with Valid Credential
    Given User Launch Chrome browser
    When User opens Url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out button
    Then Page Title should be "Your store. Login"
    And Close browser
