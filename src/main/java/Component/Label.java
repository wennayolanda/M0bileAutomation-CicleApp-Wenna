package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Label extends PageObject {
    public Label(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);

    public void skipLabel() throws InterruptedException {
        MobileElement skip = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='Skip']")));
        skip.click();
    }
}
