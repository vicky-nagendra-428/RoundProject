package facebook;

import com.thoughtworks.gauge.Step;
import mobile.FacebookLogin;
import mobile.MobileBase;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class facebookMobileSteps {

    FacebookLogin facebookLogin = new FacebookLogin();

    @Step ("Given I open the facebook app")
    public void openTheFacebookApp() {

        assertTrue("Facebook app launch failed", facebookLogin.openTheFacebookApp());

    }

    @Step ("And login to facebook app using <EMAIL> and <PASSWORD>")
    public void loginToFacebookUsing(String email, String password) {

        assertTrue("Login failed for facebook app ", facebookLogin.loginWithCredentials(email, password));

    }

    @Step ("When login is successful")
    public void checkTheLoginIsSuccessful() {

    }

    @Step ("Then I check for the comment posted <This is my test comment>")
    public void checkForTheCommentInCommentsSection(String comment) {

    }
}
