package pageObjects.circlesLife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class LoggedInUser extends ParentPage {

    public LoggedInUser() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (xpath = "//div[contains(text(),'LOGOUT')]")
    private WebElement logOutOption;

    public boolean checkLoginIsSuccessful() {
        return checkElementIsDisplayed(logOutOption);
    }

    public void clickTheMenuOption(String menuOptionName) {
        click(pageDriver.findElement(By.xpath("//a/div[contains(text(),'" + menuOptionName + "')]")));
    }


}
