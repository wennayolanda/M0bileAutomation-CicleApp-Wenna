package Object;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import Utils.Utils;
public class PageObject {
    protected static AppiumDriver<MobileElement> androidDriver;

    public PageObject(AppiumDriver driver) {
        this.androidDriver = driver;
        PageFactory.initElements(driver, this);

        Utils.setDriver((AndroidDriver<MobileElement>) driver);
    }
}
