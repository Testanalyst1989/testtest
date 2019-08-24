Feature: Examples test
  Scenario Outline: Verify multiple access
    Given I am a Google Chrome user
    When  I access "<websiteName>" website
    Then  I see title as "<websiteTitle>"

    Examples:
  |websiteName|websiteTitle|
  |https://www.facebook.com/|Facebook|
  |http://www.google.com/|Google|

