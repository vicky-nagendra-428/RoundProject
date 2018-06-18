package coreFunctions;

import com.thoughtworks.gauge.screenshot.ICustomScreenshotGrabber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pageObjects.ParentPage;

public class CustomScreenGrabber implements ICustomScreenshotGrabber {

    public byte[] takeScreenshot() {
        WebDriver driver = ParentPage.pageDriver;
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
