Feature: Demo Facebook login page
  Scenario: Verify facebook login page
    Given i am Demo google chrome user
    When i access facebook website
    Then i provide valid credentials
    Then i should  open facebook home page