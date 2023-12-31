# encoding: utf-8
# Author
# Date
# Description
@regressionAutomationPractice
Feature: Feature to test Form Page funcionality

  Background: User navigate to the login page
    Given the user is in the home page of "automationPractice"

  @contacFormSuccess
  Scenario: User fills the form Submit Error
    Given the user navigates to the contact form page
    And fills all text fields properly
    When the user clicks the submit button
    Then then the "success" message "Your message has been successfully sent to our team." is displayed to the customer