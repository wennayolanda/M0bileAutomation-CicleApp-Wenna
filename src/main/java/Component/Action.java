package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class Action extends PageObject {
    public Action(AppiumDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(Hooks.driver, 50);
    public void pressEnter() {
        KeyEvent keyEvent = new KeyEvent(AndroidKey.ENTER);
        ((AndroidDriver<MobileElement>) androidDriver).pressKey(keyEvent);
    }

//    public void scrollScreen() {
//        Dimension screenSize = Hooks.driver.manage().window().getSize();
//        int screenWidth = screenSize.getWidth();
//        int screenHeight = screenSize.getHeight();
//
//        By publishButtonXPath = By.xpath("//android.widget.Button[@content-desc='Publish']");
//
//        scrollToElement(Hooks.driver, publishButtonXPath, screenWidth, screenHeight);
//
//        Hooks.driver.findElement(publishButtonXPath).click();
//
//        private void scrollToElement(AppiumDriver<MobileElement> driver, By publishButtonXPath, int screenWidth, int screenHeight) {
//        }
//    }



}
