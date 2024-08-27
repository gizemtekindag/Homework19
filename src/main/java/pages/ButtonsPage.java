package pages;

import static com.codeborne.selenide.Selenide.*;

public class ButtonsPage {
    public void openPage() {
        open("https://demoqa.com/elements");
    }

    public void clickButtons() {
        $x("//span[text()='Buttons']").click();
    }

    public void clickClickMeButton() {
        $x("//button[text()='Click Me']").click();
    }

    public String getMessage() {
        return $("#dynamicClickMessage").getText();
    }
}
