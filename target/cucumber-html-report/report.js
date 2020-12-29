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
  "name": "sample feature file is ready1",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I run the feature file1",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "run should be successful1",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample_stepDefinition.givenStatement()"
});
formatter.result({
  "duration": 121867400,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.whenStatement()"
});
formatter.result({
  "duration": 68900,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.thenStatment()"
});
formatter.result({
  "duration": 49400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "sample feature file is ready2",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I run the feature file2",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "run should be successful2",
  "keyword": "Then "
});
formatter.match({
  "location": "Sample_stepDefinition.givenStatement2()"
});
formatter.result({
  "duration": 45400,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.whenStatement2()"
});
formatter.result({
  "duration": 34600,
  "status": "passed"
});
formatter.match({
  "location": "Sample_stepDefinition.thenStatment2()"
});
formatter.result({
  "duration": 36100,
  "status": "passed"
});
});