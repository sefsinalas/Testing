package tenzzen;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BeforeAndAfterTestListener;

import static org.testng.Assert.assertTrue;

@Listeners({BeforeAndAfterTestListener.class})
public class ContactFormTest {
    private pom.HomePage homePage;

    @BeforeClass( groups = { "Regression", "Critical" })
    public void beforeClass() {
        homePage = new pom.HomePage();
    }

    @Test(priority = 3, groups = { "Regression", "Critical" })
    public void loginOperatorOk() throws InterruptedException {
        homePage.load();
        homePage.writeForm();
        assertTrue(homePage.getButtonText().equals("ENVIAR"));
    }

}
