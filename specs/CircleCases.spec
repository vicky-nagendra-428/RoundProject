Circle Test Specifications
==========================

These are the test scenarios for the specs

Tags : Circles-Project

    |EMAIL|PASSWORD|
    |-----|--------|
    |TestEmail|TestPassword|

Login to circles web site and verify the email address
------------------------------------------------------

* Given I open the circles life home page
* And click on buy now button
* And I login with <EMAIL> and <PASSWORD>
* When The login is successful
* Then I go to "MY ACCOUNT" tab
* And verify the email address is <EMAIL>
