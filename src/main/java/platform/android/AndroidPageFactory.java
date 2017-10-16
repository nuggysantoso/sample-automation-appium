package platform.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public boolean isElementPresent(By by) {
        driverWait = new WebDriverWait(driver, 30);
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(by)).isDisplayed();
    }

    public void assertTrue(boolean condition) {
        Assert.assertTrue(condition);
    }

    public void assertTrue(boolean condition, String message) {
        Assert.assertTrue(message, condition);
    }

    public void assertEquals(boolean actual,boolean expected, String message) {
        Assert.assertEquals(message, expected, actual);
    }

    public void assertEquals(String actual,String expected, String message) {
        Assert.assertEquals(message, expected, actual);
    }

    public void assertEquals(String actual,String expected) {
        Assert.assertEquals(expected, actual);
    }

    public void assertNotSame(String unexpected, String actual, String message) {
        Assert.assertNotSame(message, unexpected, actual);
    }
}
