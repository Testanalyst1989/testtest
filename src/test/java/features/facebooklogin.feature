Feature: Facebook Login page
#  Scenario: Verify element in facebook login page
#    Given  I am a Google Chrome user
#    When  I access  facebook website
#    And  I see facebook Login Page
#    And  I see Username Textbox
#    And I see Password Textbox
#    Then I see Login Button


Scenario: Facebook login page
  Given  i am Access facebook website page
  When   i access webelement using Xpath
  Then  i see personal facebook page
