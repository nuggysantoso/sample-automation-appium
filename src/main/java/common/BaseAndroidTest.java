package common;

import org.junit.Before;
import platform.android.bukalapak.AbstractPage;
import platform.android.bukalapak.HomePage;

/**
 * Created by nugroho_s on 10/5/17.
 */
public class BaseAndroidTest extends AppiumDriverBuilder {
    private final String platform = "Android";

    /**
     * List of page
     * Please make sure the class from android package
     */
    protected HomePage homePage;
    protected AbstractPage abstractPage;


    @Before
    public void setUp() throws Exception {
        super.setPlatform(platform);
        super.setDriver();
        homePage = new HomePage(getDriver());
        abstractPage = new AbstractPage(getDriver());
    }
}
