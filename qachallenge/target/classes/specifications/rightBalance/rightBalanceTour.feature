# encoding: utf-8
# Author
# Date
# Description
@regressionRightBalance
Feature: Right Balance Main Page Tour

  Background: User navigate to the login page
    Given the user is in the home page of "rightBalance"

  @ScenarioOutlineRB
  Scenario Outline: Clicks through headers
    Given the user is in "<headerBarName>" part of the main page
    And the header text element "<headerText>" is displayed
    When the user scrolls down until the text element "<scrollToElement>" is displayed
    Then the page should display the info "<bottomPageText>" at the bottom of the page

    Examples: 
      | headerBarName | headerText                                  | scrollToElement                       | bottomPageText |
      | HOME PAGE     | RIGHT BALANCE                               | Succeed as a strong technology leader | LET�S CHAT     |
      | CASE STUDIES  | TRUSTED BY MANY                             | BE THE NEXT SUCCESS STORY             | LET�S CHAT     |
      | TEAM          | HELPING TECHNOLOGY LEADERS EVOLVE HUMANKIND | FOR TECHNOLOGISTS BY TECHNOLOGISTS    | START NOW      |
      | CAREERS       | LAST JOB YOU�LL EVER NEED                   | JOIN RIGHT BALANCE                    | APPLY          |
      | LEARN         | LEARNING                                    | FOR TECHNOLOGISTS BY TECHNOLOGISTS    | LET�S CHAT     |

  @contactPage
  Scenario: User fills in the Contact Page form
    Given the user is in the "CONTACT" page form
    When the user fills in all the fields
    Then all fields of the Contact page form must be kept filled in

  @reportMaliciousModal
  Scenario: User fills in the Report malicious form modal with funny message
    Given the user is in the Report Malicious modal form
    And clicks the "Other" radio button
    Then the user types slowly "Thanks for watching! This was just a funny show case of test scenarios with Selenium. Nothing is going to be submitted. Bye! :)"
