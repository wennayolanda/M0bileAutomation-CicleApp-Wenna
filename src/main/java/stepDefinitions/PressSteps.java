package stepDefinitions;

import Component.Action;
import Hooks.Hooks;
import io.cucumber.java.en.Then;

public class PressSteps {
    @Then("user press enter in keyboard")
    public void userPressEnterInKeyboard() {
        Action enter = new Action(Hooks.driver);
        enter.pressEnter();
    }
}
