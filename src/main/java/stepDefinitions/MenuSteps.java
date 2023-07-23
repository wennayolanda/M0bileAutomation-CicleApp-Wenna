package stepDefinitions;

import Component.Menu;
import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {

    @When("user click existing company")
    public void userClickExistingCompany() {
        Menu menu = new Menu(Hooks.driver);
        menu.existCompany();
    }

    @Given("user click existing Headquarter card")
    public void userClickExistingHeadquarterCard() {
        Menu menu = new Menu(Hooks.driver);
        menu.firstHqCard();
    }

    @Then("user click Group Chat menu")
    public void userClickGroupChatMenu() {
        Menu menu = new Menu(Hooks.driver);
        menu.groupChatMenu();
    }

    @Then("user click Blast menu")
    public void userClickBlastMenu() {
        Menu menu = new Menu(Hooks.driver);
        menu.blastMenu();
    }

    @Then("user click Board menu")
    public void userClickBoardMenu() {
        Menu menu = new Menu(Hooks.driver);
        menu.boardMenu();
    }

    @Then("user click CheckIns menu")
    public void userClickCheckInsMenu() {
        Menu menu = new Menu(Hooks.driver);
        menu.checkInsMenu();
    }

    @When("user click existing Team card")
    public void userClickExistingTeamCard() {
        Menu menu = new Menu(Hooks.driver);
        menu.teamMenu();
    }

    @When("user click existing Project card")
    public void userClickExistingProjectCard() {
        Menu menu = new Menu(Hooks.driver);
        menu.projectMenu();
    }
}
