package pageObjects.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class FacebookLogin extends ParentPage {

    public FacebookLogin() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (id = "email")
    private WebElement userNameTextField;

    @FindBy (id = "pass")
    private WebElement passwordTextField;

    @FindBy (id = "loginbutton")
    private WebElement loginButton;

    public void openTheFacebookHomePage() {
        loadTheUrl(System.getenv("Facebook_Url"));
    }

    public boolean facebookHomePageIsLoaded() {
        return checkElementIsDisplayed(userNameTextField);
    }

    public void enterUserName(String userName) {
        clearAndSendKeys(userNameTextField, System.getenv("Facebook_" + userName));
    }

    public void enterPassword(String password) {
        clearAndSendKeys(passwordTextField, System.getenv("Facebook_" + password));
    }

    public void clickTheLoginButton() {
        click(loginButton);
    }
}
