package Utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Utils {
    private static AndroidDriver<MobileElement> driver;

    public static void setDriver(AndroidDriver<MobileElement> appiumDriver) {
        driver = appiumDriver;
    }
}
