package platform.android.bukalapak;

import common.BaseAndroidTest;
import org.junit.Test;

/**
 * Created by nugroho_s on 10/16/17.
 */
public class HomeTest extends BaseAndroidTest{
    @Test
    public void testCasesId() {
        homePage.checkHomePageIsDisplayed();
        homePage.clickOkButtonHomeScreen();
    }
}
