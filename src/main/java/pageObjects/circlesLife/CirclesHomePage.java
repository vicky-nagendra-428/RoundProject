package pageObjects.circlesLife;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ParentPage;

public class CirclesHomePage extends ParentPage {

    public CirclesHomePage() {
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy (xpath = "//a[contains(text(),'Buy now')]")
    private WebElement buyNowButton;

    public void loadTheCirclesLifeHomePage() {
        loadTheUrl(System.getenv("CirclesLife_HomePage_URL"));
    }

    public boolean verifyHomePageIsLoaded() {
        return checkElementIsDisplayed(buyNowButton);
    }

    public void clickOnBuyNowButton() {
        buyNowButton.click();
    }

}
