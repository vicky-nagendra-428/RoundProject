package facebook;

import com.thoughtworks.gauge.Step;
import pageObjects.facebook.FacebookLogin;
import pageObjects.facebook.FacebookUserPage;

import static org.junit.Assert.assertTrue;

public class facebookSteps {

    FacebookLogin facebookLogin = new FacebookLogin();
    FacebookUserPage facebookUserPage = new FacebookUserPage();

    @Step ("Given I open the facebook from web browser")
    public void openTheFacebookHomePage() {
        facebookLogin.openTheFacebookHomePage();
    }

    @Step ("And I login to facebook with <EMAIL> and <PASSWORD>")
    public void loginToFacebookWith(String email, String password) {
        assertTrue("Failed to load the facebook login page", facebookLogin.facebookHomePageIsLoaded());
        facebookLogin.enterUserName(email);
        facebookLogin.enterPassword(password);
        facebookLogin.clickTheLoginButton();
    }

    @Step ("When facebook login is successful")
    public void checkFacebookLoginIsSuccessful() {
        assertTrue("Login failed/ user Page is not loaded", facebookUserPage.facebookUserPageIsOn());
    }

    @Step ("Then I post a comment <TESTCOMMENT>")
    public void postAcomment(String commentText) {
        facebookUserPage.writeThePost(commentText);
        assertTrue("Comment posted successfully", facebookUserPage.checkCommentIsPostedSuccessfully(commentText));
    }
}
