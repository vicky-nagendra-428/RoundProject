package circlesProject;

import com.thoughtworks.gauge.Step;
import pageObjects.circlesLife.CirclesHomePage;
import pageObjects.circlesLife.LoggedInUser;
import pageObjects.circlesLife.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    CirclesHomePage circlesHomePage = new CirclesHomePage();
    LoginPage loginPage = new LoginPage();
    LoggedInUser loggedInUser = new LoggedInUser();

    @Step ("When The login is successful")
    public void checkTheLoginIsSuccess() {
        assertTrue("Login is not successful", loggedInUser.checkLoginIsSuccessful());
    }

    @Step ("Given I open the circles life home page")
    public void openTheCirclesLifeHomePage() {
        circlesHomePage.loadTheCirclesLifeHomePage();
    }

    @Step ("And I login with <EMAIL> and <PASSWORD>")
    public void loginWithEmailPassword(String email, String password) {
        assertTrue("Login screen is not displayed", loginPage.checkLoginScreenIsAppered());
        loginPage.login(email, password);
    }

    @Step ("And click on buy now button")
    public void clickOnBuyNowButton() {
        circlesHomePage.clickOnBuyNowButton();
    }
}
