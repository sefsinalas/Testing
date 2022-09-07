package pom;

import org.openqa.selenium.By;
import pom.BasePage;
import pom.DefaultPage;

import java.util.Arrays;

public class HomePage extends BasePage implements DefaultPage {

    final By nameInput = By.xpath("//input[@name='wpforms[fields][0]']");
    final By sendButton = By.xpath("//button[@name='wpforms[submit]']");

    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://tenzzen.com";
    }

    @SafeVarargs
    public final <T> void load(T... values){
        visit(getUrl(values));
    }

    @Override
    public boolean validateField(String element, String attribute, String value) {
        return false;
    }


    public String getButtonText() {
        waitForElementVisible(nameInput);
        return getText(sendButton);
    }

    public void writeForm() throws InterruptedException {
        Thread.sleep(2500);
        waitForElementVisible(nameInput);
        sendKeys("Fede", nameInput);
        //click(sendButton);
    }
}
