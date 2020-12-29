$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/bdd/Sample.feature");
formatter.feature({
  "line": 3,
  "name": "To test my cucumber test is running",
  "description": "\t\t\tI want to run a sample feature file.",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "sample feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample_stepDefinition.givenStatement()"
});
formatter.result({
  "duration": 144553900,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.whenStatement()"
});
formatter.result({
  "duration": 236400,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.thenStatment()"
});
formatter.result({
  "duration": 71300,
  "status": "passed"
});
});