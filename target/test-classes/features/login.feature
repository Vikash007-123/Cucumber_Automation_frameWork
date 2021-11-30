Feature: Application Login

Background:
Given Validated the Browser
When  Open the Browser
Then  check the Browser name
@SmokeTest
Scenario: Home page default login
Given     User is on NetBanking landing page
When      User login into application with  "jin" and password "1234"
Then      Home page is populated
And       Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given     User is on NetBanking landing page
When      User login into application with  "john" and password "4563"
Then      Home page is populated
And       Cards displayed are "false"

@SmokeTest
Scenario: Home page default login
Given     User is on NetBanking landing page
When      User signup with following details
|vikash|kumar|vikash.kumar@gmail.com|28|
Then      Home page is populated
And       Cards displayed are "false"

@Regressiontest
Scenario Outline: Home page default login
Given     User is on NetBanking landing page
When      User login in to application with  "<Username>" and password "<Password>"
Then      Home page is populated
And       Cards displayed are "false"

Examples:
|Username     |Password  |
|user1        |pass1     |
|user2        |pass2     |
|user3        |pass3     |
|user4        |pass4     |
