package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Icon extends PageObject {
    public Icon(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);

    public void profilMenuIcon() {
        MobileElement menu = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[contains(@content-desc, 'Tab 4 of 4')]")));
        menu.click();
    }

    public void inboxIcon() {
        MobileElement inbox = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Inbox']")));
        inbox.click();
    }

    public void doneCreateTaskIcon() {
        MobileElement done = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Private Card']/android.widget.EditText/android.view.View")));
        done.click();
    }

    public void contactIcon() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='abigail']")));
        btn.click();
    }
}
