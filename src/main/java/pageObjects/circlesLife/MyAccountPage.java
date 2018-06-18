package pageObjects.circlesLife;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class MyAccountPage extends ParentPage {

    public MyAccountPage() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (xpath = "//span[contains(text(),'Personal Details')]")
    private WebElement personalDetailsSection;

    public boolean checkMyAccountPageIsLoaded() {
        return checkElementIsDisplayed(personalDetailsSection);
    }

    public boolean checkEmailIsCorrectAs(String emailAddressParam) {
        String emailAddress = System.getenv("CirclesLife_" + emailAddressParam);
        return checkElementIsDisplayed(pageDriver.findElement(By.xpath("//input[contains(@value, '" + emailAddress + "')]")));
    }

}
