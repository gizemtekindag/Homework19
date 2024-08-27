package steps;

import io.cucumber.java.en.*;
import pages.WebTablesPage;
import static org.junit.Assert.*;

public class WebTablesStepDefinitions {
    WebTablesPage webTablesPage = new WebTablesPage();

    @Given("I am on the Web Tables page")
    public void iAmOnTheWebTablesPage() {
        webTablesPage.openPage();
    }

    @When("I add a new record with details {string}, {string}, {string}, {string}, {string}, {string}")
    public void iAddANewRecord(String firstName, String lastName, String email, String age, String salary, String department) {
        webTablesPage.clickAddButton();
        webTablesPage.fillForm(firstName, lastName, email, age, salary, department);
    }

    @When("I edit the added record")
    public void iEditTheAddedRecord() {
        webTablesPage.editRecord();
    }

    @Then("the record should be updated")
    public void theRecordShouldBeUpdated() {
        String recordDetails = webTablesPage.getRecordDetails();
        assertTrue(recordDetails.contains("Updated info"));
    }
}
