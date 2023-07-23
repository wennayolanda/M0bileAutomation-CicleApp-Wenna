package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import Utils.Utils;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Hooks {
    public static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities capabilities;

    @Before
    public void setUp() throws Exception {
        String projectLocation = System.getProperty("user.dir");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "V2130");
        capabilities.setCapability("udid", "3441466115000FB");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("app", projectLocation + "/androidApp/apk-staging-for-iqbal.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Utils.setDriver((AndroidDriver<MobileElement>) driver);
    }
}
