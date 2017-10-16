package common;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class Constants {
    /**
     * Default Constant value for ios and android
     */
    public static final String APPIUM_URL="http://127.0.0.1:4723/wd/hub";
    public static final String DEFAULT_APP_PATH= System.getProperty("user.home") + "/Documents/";

    /**
     * Default Constant value for android
     */
    public static final String DEFAULT_ANDROID_PLATFORM_VERSION="5.1.1";
    public static final String DEFAULT_ANDROID_DEVICE_NAME="AndroidL";
    public static final String DEFAULT_ANDROID_APP_NAME ="Bukalapak.apk";
    public static final String DEFAULT_ANDROID_PAKCAGE_NAME ="com.bukalapak.android";
    public static final String DEFAULT_ANDROID_ACTIVITY_NAME ="com.bukalapak.android.HomeActivity_";
    public static final String DEFAULT_ANDROID_WAIT_ACTIVITY = "com.bukalapak.android.HomeActivity_";
    public static final Boolean DEFAULT_ANDROID_FULL_RESET_VALUE = true;
    public static final int DEFAULT_ANDROID_COMMAND_TIMEOUT = 320000;
}
