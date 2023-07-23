package stepDefinitions;

import Component.Icon;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IconSteps {

    @And("user click menu icon and inbox icon")
    public void userClickMenuIconAndInboxIcon() throws InterruptedException {
        Icon icon = new Icon(Hooks.driver);
        Thread.sleep(1000);
        icon.profilMenuIcon();
        icon.inboxIcon();
    }

    @Then("user choose contact from list")
    public void userChooseContactFromList() {
        Icon icon = new Icon(Hooks.driver);
        icon.contactIcon();
    }

    @When("user click menu icon")
    public void userClickMenuIcon() throws InterruptedException {
        Icon icon = new Icon(Hooks.driver);
        Thread.sleep(1000);
        icon.profilMenuIcon();
    }

    @And("user clicks done icon")
    public void userClicksDoneIcon() {
        Icon icon = new Icon(Hooks.driver);
        icon.doneCreateTaskIcon();
    }
}
