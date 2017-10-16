package platform.android.bukalapak;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import platform.android.AndroidPageFactory;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class AbstractPage extends AndroidPageFactory {
    public AbstractPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    @AndroidFindBy(id = "button_showcase")
    public MobileElement okButtonHomeScreen;

    public void clickOkButtonHomeScreen(){
        assertTrue(okButtonHomeScreen.isDisplayed(), "Failed : Ok Button Not Displayed");
        okButtonHomeScreen.click();
    }
}
