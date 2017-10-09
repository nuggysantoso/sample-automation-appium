package common;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class BaseAndroidTest extends AppiumDriverBuilder {
    private final String platform = "ANDROID";
    private final String appName = "";

    @BeforeMethod
    @Parameters({ "URL_"})
    public void setUp(String URL_) throws Exception {
        super.setPlatform(platform);
        super.setApp(appName);
        super.setDriver(URL_);
    }
}
