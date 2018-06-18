Facebook User flow Spec
=======================

    |EMAIL|PASSWORD|TESTCOMMENT|
    |-----|--------|-----------|
    |TestEmail|TestPassword|This is my test comment|

* Given I open the facebook from web browser
* And I login to facebook with <EMAIL> and <PASSWORD>
* When facebook login is successful
* Then I post a comment <TESTCOMMENT>


Validate the comments posted from web
-------------------------------------

* Given I open the facebook app
* And login to facebook app using <EMAIL> and <PASSWORD>
* When login is successful
//* Then I check for the comment posted <TESTCOMMENT>