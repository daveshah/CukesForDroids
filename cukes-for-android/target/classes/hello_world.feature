Feature: Hello World
  Background: Testing Native driver + cucumber-jvm combo
    Given I have launched my hello world activity

  Scenario: Clicking The Hello World Button
    When I click the button labeled Click Me!
    Then I should see that the text has changed to Cucumber Helped Click My Button!