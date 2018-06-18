package coreFunctions;

import org.openqa.selenium.WebDriver;

public class WebDriverPool {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver webdriver) {
        webDriver.set(webdriver);
    }

}
