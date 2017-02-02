Feature: validation of car search page
  In order to validate car search
  as a buyer
  I navigate http://wwww.carsguide.com/au

  Scenario: Searchign for a new car
    Given I am on the home page http://www.carsguide.com.au of carsguide website
    When i move to Car for Sale Menu
    Then i click on search cars
    And I select Make as "BMW"
    And I select Model as "1SERIES"
    And I Select location as "Australia"
    And I select price as "$10000"
    And i click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Cars Under 10000 for Sale | CarsGuide"
