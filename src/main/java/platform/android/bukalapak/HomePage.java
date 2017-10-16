package platform.android.bukalapak;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

/**
 * Created by nugroho_s on 10/16/17.
 */
public class HomePage extends AbstractPage{
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void checkHomePageIsDisplayed(){
        isElementPresent(By.id("text_search"));
//        log("Check Home Page Is Displayed");
    }
}
