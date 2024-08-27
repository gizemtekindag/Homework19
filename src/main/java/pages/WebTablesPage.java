package pages;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage {
    public void openPage() {
        open("https://demoqa.com/webtables");
    }

    public void clickAddButton() {
        $("#addNewRecordButton").click();
    }

    public void fillForm(String firstName, String lastName, String email, String age, String salary, String department) {
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#age").setValue(age);
        $("#salary").setValue(salary);
        $("#department").setValue(department);
        $("#submit").click();
    }

    public void editRecord() {

    }

    public String getRecordDetails() {
        return $("#recordDetails").getText();
    }
}
