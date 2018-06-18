package pageObjects;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ParentPage {

    public static WebDriver pageDriver;
    JavascriptExecutor js = (JavascriptExecutor) pageDriver;

    public static void setPageDriver(WebDriver driver) {
        pageDriver = driver;
    }

    public WebDriver getDriver() {
        return pageDriver;
    }

    public void loadTheUrl(String url) {
        pageDriver.get(url);
    }

    public boolean checkElementIsDisplayed(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(pageDriver, 20);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public void clearAndSendKeys(WebElement element, String stringToEnter) {
        element.clear();
        element.sendKeys(stringToEnter);
    }

    public void jsEnterText(WebElement element, String textToEnter) {
        js.executeScript("arguments[0].click()", element);
    }

    public void moveToElementAndClickAndSendKeys(WebElement element, String text) {
        Actions actions = new Actions(pageDriver);
        actions.moveToElement(element).click().sendKeys(text).build().perform();
    }

    public void click(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
