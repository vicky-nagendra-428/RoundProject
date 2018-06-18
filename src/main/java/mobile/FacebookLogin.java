package mobile;

import io.appium.java_client.MobileElement;
import java.util.List;

public class FacebookLogin extends MobileBase {

    private String mainLoginLayoutChildren = ".//*[@resource-id='com.facebook.lite:id/main_layout']/child::*";

    public boolean checkFacebookLoginScreenIsOpened() {

        MobileElement mainLoginScreen = androidDriver.findElementByXPath(mainLoginLayoutChildren);
        return checkElementIsDisplayed(mainLoginScreen);

    }

    public boolean openTheFacebookApp() {
        try {
            configure();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginWithCredentials(String email, String password) {

        try {
            List<MobileElement> loginScreenElements = androidDriver.findElementByXPath(mainLoginLayoutChildren)
                                                                    .findElementsByClassName("android.view.View");

            loginScreenElements.get(2).setValue(System.getenv("Facebook_" + email));
            loginScreenElements.get(4).setValue(System.getenv("Facebook_" + password + "\n"));
            loginScreenElements.get(5).click();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

}
