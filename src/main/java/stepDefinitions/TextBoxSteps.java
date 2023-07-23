package stepDefinitions;

import Hooks.Hooks;
import Component.TextBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TextBoxSteps {

    @When("user input {string} in name field")
    public void userInputInNameField(String name) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickNameTextBox();
        box.enterNameTextBox(name);
    }

    @And("user input {string} in description field")
    public void userInputInDescriptionField(String desc) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickDescTextBox();
        box.enterDescTextBox(desc);
    }

    @When("user types {string} in the chat box")
    public void userTypesInTheChatBox(String chat) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickChatTextBox();
        box.chatTextBox(chat);
    }

    @When("user input blast title {string}")
    public void userInputBlastTitle(String title) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickBlastTitle();
        box.enterBlastTitle(title);
    }

    @And("user input blast desc {string}")
    public void userInputBlastDesc(String body) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickBlastBody();
        box.enterBlastBody(body);
    }

    @When("user input {string} in board list textbox")
    public void userInputInBoardListTextbox(String nameList) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickBoardListName();
        box.enterBoardListName(nameList);
    }

    @When("user input {string} in task textbox")
    public void userInputInTaskTextbox(String name) {
        TextBox box = new TextBox(Hooks.driver);
        box.enterTaskName(name);
    }

    @When("user input {string} in check-ins question box")
    public void userInputInCheckInsQuestionBox(String question) {
        TextBox box = new TextBox(Hooks.driver);
        box.clickQuestionBox();
        box.enterQuestionBox(question);
    }
}
