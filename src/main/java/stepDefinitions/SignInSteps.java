package stepDefinitions;

import Component.Button;
import Component.Label;
import Hooks.Hooks;
import io.cucumber.java.en.*;

public class SignInSteps {

    @Given("user open the application")
    public void userOpenTheApplication() throws Exception {
        Hooks hooks = new Hooks();
        hooks.setUp();
        Thread.sleep(1000);
    }

    @And("user click Don't Allow button")
    public void userClickDonTAllowButton() {
        Button btn = new Button(Hooks.driver);
        btn.dontAllow();
    }

    @When("user click Skip label and click Sign In button")
    public void userClickSkipLabelAndClickSignInButton() throws InterruptedException {
        Label label = new Label(Hooks.driver);
        Button btn = new Button(Hooks.driver);
        label.skipLabel();
        btn.signIn();
    }

    @And("user click Google button and select valid email")
    public void userClickGoogleButtonAndSelectValidEmail() {
        Button btn = new Button(Hooks.driver);
        btn.googleBtn();
        btn.selectEmail();
    }
}
