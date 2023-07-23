package stepDefinitions;

import Component.Scroll;
import Hooks.Hooks;
import Component.Button;
import Component.Action;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;

public class ButtonSteps {

    @Given("user click create new company button")
    public void userClickCreateNewCompanyButton() throws InterruptedException {
        Button btn = new Button(Hooks.driver);
        Thread.sleep(1000);
        btn.createNewComp();
    }

    @Then("user click Create button")
    public void userClickCreateButton() {
        Button btn = new Button(Hooks.driver);
        btn.createBtn();
    }

    @When("user click Add New HQ card button")
    public void userClickAddNewHQCardButton() {
        Button btn = new Button(Hooks.driver);
        btn.newHqCardBtn();
    }

    @When("user click Add New Team card button")
    public void userClickAddNewTeamCardButton() {
        Button btn = new Button(Hooks.driver);
        btn.newTeamCardBtn();
    }

    @When("user click Add New Project card button")
    public void userClickAddNewProjectCardButton() {
        Button btn = new Button(Hooks.driver);
        btn.newProjectCardBtn();
    }

    @And("user click Start Chat button")
    public void userClickStartChatButton() {
        Button btn = new Button(Hooks.driver);
        btn.startPrivChatBtn();
    }

    @Then("user clicks Send button")
    public void userClicksSendButton() {
        Button btn = new Button(Hooks.driver);
        btn.sendChatBtn();
    }

    @Given("user click add button")
    public void userClickAddButton() {
        Button btn = new Button(Hooks.driver);
        btn.plusBtn();
    }

    @Then("user clicks publish blast button")
    public void userClicksPublishBlastButton() throws InterruptedException {
        Scroll scroll = new Scroll(Hooks.driver);
        Thread.sleep(2000);
        By publishButtonXPath = By.xpath("//android.widget.Button[@content-desc='Publish']");
        scroll.scrollToElement(publishButtonXPath, Hooks.driver.manage().window().getSize().getWidth(), Hooks.driver.manage().window().getSize().getHeight());
    }

    @And("user clicks Submit List Board button")
    public void userClicksSubmitListBoardButton() {
        Button btn = new Button(Hooks.driver);
        btn.submitBoardListBtn();
    }

    @Given("user clicks Add new card button")
    public void userClicksAddNewCardButton() {
        Button btn = new Button(Hooks.driver);
        btn.addNewCardBtn();
    }
}
