package circlesProject;

import com.thoughtworks.gauge.Step;
import pageObjects.circlesLife.LoggedInUser;
import pageObjects.circlesLife.MyAccountPage;

public class LoggedInUserSteps {

    MyAccountPage myAccountPage = new MyAccountPage();
    LoggedInUser loggedInUser = new LoggedInUser();

    @Step ("Then I go to <MY ACCOUNT> tab")
    public void goToTab(String tabName) {
        loggedInUser.clickTheMenuOption(tabName);
    }

    @Step ("And verify the email address is <EMAIL>")
    public void verifyEmailAddress(String email) {
        myAccountPage.checkMyAccountPageIsLoaded();
        myAccountPage.checkEmailIsCorrectAs(email);
    }
}
