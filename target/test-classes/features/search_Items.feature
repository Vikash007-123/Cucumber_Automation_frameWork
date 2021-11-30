Feature: Search and place order for vegetables
@SeleniumTest
Scenario: Search for items and validate results
Given     User is on GreenKart landing page
When      user search for "Cucumber" vegetables
Then      "Cucumber" Results are displayed

