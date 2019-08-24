Feature: Access Websites through internet
  Scenario: Access google.com
    Given I am a Google Chrome user
    When  I access Google website
    Then  I see Google Home Page