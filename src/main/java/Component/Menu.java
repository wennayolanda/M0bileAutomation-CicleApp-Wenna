package Component;

import Hooks.Hooks;
import Object.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Menu extends PageObject {
    public Menu(AppiumDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(Hooks.driver, 20);
    public void existCompany() {
        MobileElement menu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='NewCorp']")));
        menu.click();
    }

    public void firstHqCard() {
        MobileElement hq = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[contains(@content-desc, 'QA Headquarter')]")));
        hq.click();
    }

    public void groupChatMenu() {
        MobileElement chat = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Group Chat']")));
        chat.click();
    }

    public void blastMenu() {
        MobileElement blast = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Blast']")));
        blast.click();
    }

    public void boardMenu() {
        MobileElement board = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Board']")));
        board.click();
    }

    public void checkInsMenu() {
        MobileElement check = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='Check-Ins']")));
        check.click();
    }

    public void teamMenu() {
        MobileElement team = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[contains(@content-desc, 'QA Division')]")));
        team.click();
    }

    public void projectMenu() {
        MobileElement project = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[contains(@content-desc, 'QA Projects')]")));
        project.click();
    }



}
