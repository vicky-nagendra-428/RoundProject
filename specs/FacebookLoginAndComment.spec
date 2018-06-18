Facebook User flow Spec
=======================

    |EMAIL|PASSWORD|TESTCOMMENT|
    |-----|--------|-----------|
    |TestEmail|TestPassword|This is my test comment|

Login to facebook and post a comment
------------------------------------

* Given I open the facebook from web browser
* And I login to facebook with <EMAIL> and <PASSWORD>
* When facebook login is successful
* Then I post a comment <TESTCOMMENT>