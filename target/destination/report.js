$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sande/IdeaProjects/testtest/src/test/java/features/Facebookloginpom.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Forgotten page",
  "description": "",
  "id": "facebook-forgotten-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4157615532,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Facebook forgotten account",
  "description": "",
  "id": "facebook-forgotten-page;facebook-forgotten-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "i am in facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on the forgotten account link",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Enter the Credentials Click on search",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i see Reset your password page",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebookloginpomstepdefinition.I_am_in_facebook_page()"
});
formatter.result({
  "duration": 19008333044,
  "status": "passed"
});
formatter.match({
  "location": "Facebookloginpomstepdefinition.click_on_the_forgotten_account_link()"
});
formatter.result({
  "duration": 1624445728,
  "status": "passed"
});
formatter.match({
  "location": "Facebookloginpomstepdefinition.Enter_the_Credentials_Click_on_search()"
});
formatter.result({
  "duration": 379036744,
  "status": "passed"
});
formatter.match({
  "location": "Facebookloginpomstepdefinition.i_see_Reset_your_password_page()"
});
formatter.result({
  "duration": 41482,
  "status": "passed"
});
formatter.after({
  "duration": 701114233,
  "status": "passed"
});
});