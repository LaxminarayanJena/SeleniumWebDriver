$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CarSearch.feature");
formatter.feature({
  "line": 1,
  "name": "validation of car search page",
  "description": "In order to validate car search\r\nas a buyer\r\nI navigate http://wwww.carsguide.com/au",
  "id": "validation-of-car-search-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2986523505,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Searchign for a new car",
  "description": "",
  "id": "validation-of-car-search-page;searchign-for-a-new-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the home page http://www.carsguide.com.au of carsguide website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "i move to Car for Sale Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "i click on search cars",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I select Make as \"BMW\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select Model as \"1SERIES\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Select location as \"Australia\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select price as \"$10000\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "i click on Find My Next Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the page title should be \"Bmw 1 Series Cars Under 10000 for Sale | CarsGuide\"",
  "keyword": "And "
});
formatter.match({
  "location": "CarSearchSteps.i_am_on_the_home_page_http_www_carsguide_com_au_of_carsguide_website()"
});
formatter.result({
  "duration": 11720436999,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_move_to_Car_for_Sale_Menu()"
});
formatter.result({
  "duration": 21554,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_search_cars()"
});
formatter.result({
  "duration": 25659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 18
    }
  ],
  "location": "CarSearchSteps.i_select_Make_as(String)"
});
formatter.result({
  "duration": 2413977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1SERIES",
      "offset": 19
    }
  ],
  "location": "CarSearchSteps.i_select_Model_as(String)"
});
formatter.result({
  "duration": 60554,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 22
    }
  ],
  "location": "CarSearchSteps.i_Select_location_as(String)"
});
formatter.result({
  "duration": 60041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10000",
      "offset": 19
    }
  ],
  "location": "CarSearchSteps.i_select_price_as(String)"
});
formatter.result({
  "duration": 79029,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 23093,
  "status": "passed"
});
formatter.match({
  "location": "CarSearchSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 19501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Cars Under 10000 for Sale | CarsGuide",
      "offset": 26
    }
  ],
  "location": "CarSearchSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 66199,
  "status": "passed"
});
formatter.after({
  "duration": 1177622275,
  "status": "passed"
});
});