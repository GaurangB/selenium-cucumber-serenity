@regression
Feature: Sample Feature

  @ui
  Scenario: Verify something
    Given I like an apple
    When I see an apple
    Then the apple disappears

  @service
  Scenario: Verify rest call
    Then verify the get call for employees