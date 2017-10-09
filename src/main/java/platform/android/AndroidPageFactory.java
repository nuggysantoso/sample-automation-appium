package platform.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class AndroidPageFactory {
    protected AppiumDriver driver;
    protected WebDriverWait driverWait;

    public AndroidPageFactory(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        driverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
