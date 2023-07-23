package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Button extends PageObject {
    public Button(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);

    public void signIn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Go to Sign In']")));
        btn.click();
    }
    public void googleBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Sign in with Google Account']")));
        btn.click();
    }
    public void selectEmail() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]")));
        btn.click();
    }
    public void dontAllow() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")));
        btn.click();
    }

    public void createNewComp() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Create New Company']")));
        btn.click();
    }
    public void createBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Create']")));
        btn.click();
    }

    public void plusBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")));
        btn.click();
    }

    public void newHqCardBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Add new HQ']")));
        btn.click();
    }

    public void newTeamCardBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Add new team']")));
        btn.click();
    }

    public void newProjectCardBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Add new project']")));
        btn.click();
    }

    public void startPrivChatBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")));
        btn.click();
    }

    public void sendChatBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")));
        btn.click();
    }

    public void publishBlastBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Publish']")));
        btn.click();
    }

    public void submitBoardListBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Submit']")));
        btn.click();
    }

    public void addNewCardBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@content-desc='Add new card']")));
        btn.click();
    }

    public void thursdayBtn() {
        MobileElement btn = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc='Thu']")));
        btn.click();
    }
}

