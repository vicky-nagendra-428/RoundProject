package pageObjects.circlesLife;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class LoginPage extends ParentPage {

    public LoginPage() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (name = "email")
    private WebElement emailAddressField;

    @FindBy (name = "password")
    private WebElement passwordField;

    @FindBy (xpath = "//button[contains(text(),'Sign In')]")
    private WebElement signInButton;

    public boolean checkLoginScreenIsAppered() {
        return checkElementIsDisplayed(emailAddressField);
    }

    public void login(String emailAddress, String password) {
        clearAndSendKeys(emailAddressField, System.getenv("CirclesLife_" + emailAddress));
        clearAndSendKeys(passwordField, System.getenv("CirclesLife_" + password));
        click(signInButton);
    }
}
