@sandbox
Feature: Login to production
  In order to perform sucessful login to production
  As a user
  I want to enter correct username and password

  Background: 
    Given user navigates to facebook website
    When user validates the homepage title

  Scenario Outline: In order to verify login to facebook production
    Then user entered "<username>" username
    And user entered "<password>" password
    And user select the  age category
      | age     | location |
      | below18 | india    |
      | above18 | usa      |
    And user validates the  captcha image
    Then user "<loginType>" successfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should be |
      | invalid  | inavlid  | shouldnot |
