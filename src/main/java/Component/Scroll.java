package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Scroll extends PageObject {
    public Scroll(AppiumDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(Hooks.driver, 50);

    Dimension screenSize = Hooks.driver.manage().window().getSize();
    int screenWidth = screenSize.getWidth();
    int screenHeight = screenSize.getHeight();

    By publishButtonXPath = By.xpath("//android.widget.Button[@content-desc='Publish']");

    public void scrollToElement(By publishButtonXPath, int screenWidth, int screenHeight) {
        MobileElement element = (MobileElement) new WebDriverWait(Hooks.driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(publishButtonXPath));

        while (!element.isDisplayed()) {
            TouchAction touchAction = new TouchAction(Hooks.driver);
            touchAction.press(PointOption.point(screenWidth / 2, screenHeight / 2))
                    .moveTo(PointOption.point(screenWidth / 2, 0))
                    .release()
                    .perform();
        }

        Hooks.driver.findElement(publishButtonXPath).click();
    }

}
