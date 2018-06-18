package pageObjects.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class FacebookUserPage extends ParentPage {

    public FacebookUserPage() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (css = ".navigationFocus[role]")
    private WebElement commentWriteBox;

    @FindBy (css = "button[data-testid='react-composer-post-button']")
    private WebElement commentPostButton;

    public boolean facebookUserPageIsOn() {
        String xpathOfUserNameOnTopMenu = String.format("//span[contains(text(), '%s')]", System.getenv("Facebook_TestUserName"));
        WebElement profileLink = pageDriver.findElement(By.xpath(xpathOfUserNameOnTopMenu));

        if (checkElementIsDisplayed(profileLink)) {
            click(profileLink);
            return true;
        } else {
            return false;
        }
    }

    public void writeThePost(String postToWrite) {
        click(commentWriteBox);
        moveToElementAndClickAndSendKeys(commentWriteBox, postToWrite);
        click(commentPostButton);
    }

    public boolean checkCommentIsPostedSuccessfully(String commentText) {
        checkElementIsDisplayed(commentWriteBox);
        return checkElementIsDisplayed(pageDriver.findElement(By.xpath("//p[contains(text(),'" + commentText + "')]")));
    }

}
