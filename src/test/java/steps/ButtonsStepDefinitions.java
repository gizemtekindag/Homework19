package steps;

import io.cucumber.java.en.*;
import pages.ButtonsPage;
import static org.junit.Assert.*;

public class ButtonsStepDefinitions {
    ButtonsPage buttonsPage = new ButtonsPage();

    @Given("I am on the Elements page")
    public void iAmOnTheElementsPage() {
        buttonsPage.openPage();
    }

    @When("I navigate to the Buttons section")
    public void iNavigateToTheButtonsSection() {
        buttonsPage.clickButtons();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String buttonText) {
        buttonsPage.clickClickMeButton();
    }

    @Then("I should see a success message {string}")
    public void iShouldSeeASuccessMessage(String expectedMessage) {
        assertEquals(expectedMessage, buttonsPage.getMessage());
    }
}
