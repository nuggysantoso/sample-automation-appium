package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class AppiumDriverBuilder {
    private String platform;
    private String appName;
    public AppiumDriver driver;

    public AppiumDriver getDriver(){
        return driver;
    }

    public void setDriver() throws Exception {
//        System.out.println(appName);
        if (platform.contains("Android")){
            File appDir = new File(Constants.DEFAULT_APP_PATH);
            File app = new File(appDir, Constants.DEFAULT_ANDROID_APP_NAME);
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.APP, Constants.DEFAULT_ANDROID_APP_NAME);
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Constants.DEFAULT_ANDROID_PLATFORM_VERSION);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEFAULT_ANDROID_DEVICE_NAME);
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, Constants.DEFAULT_ANDROID_FULL_RESET_VALUE);
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, Constants.DEFAULT_ANDROID_COMMAND_TIMEOUT);
            capabilities.setCapability("appPackage", Constants.DEFAULT_ANDROID_PAKCAGE_NAME);
            capabilities.setCapability("appWaitActivity", Constants.DEFAULT_ANDROID_WAIT_ACTIVITY);
            capabilities.setCapability("appActivity", Constants.DEFAULT_ANDROID_ACTIVITY_NAME);
//            capabilities.setCapability("recreateChromeDriverSessions", true);
            driver = new AndroidDriver(new URL(Constants.APPIUM_URL), capabilities);
        }
    }

    /**
     * Kill all active simulator
     */
    public void tearDown() throws Exception {
        driver.quit();
    }

    protected void setPlatform(String platform){
        this.platform = platform;
    }

    protected void setApp(String appName){
        this.appName = appName;
    }
}
