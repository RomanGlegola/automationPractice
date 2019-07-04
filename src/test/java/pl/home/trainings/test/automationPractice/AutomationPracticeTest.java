package pl.home.trainings.test.automationPractice;

import org.junit.Test;
import pl.sda.training.automationPractice.AutomationPracticeMain;
import pl.sda.training.automationPractice.ContactUsPage;
import pl.sda.training.automationPractice.TShirtPage;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeTest extends BaseTest {

    @Test
    public void testOfTshirt() {
        AutomationPracticeMain auMain = new AutomationPracticeMain(driver);
        auMain.clickTshirtButton();
        TShirtPage ts = new TShirtPage(driver);
        assertTrue(ts.isTshirtLabelVisible());
    }

    @Test
    public void testOfContactUs() throws InterruptedException {
        AutomationPracticeMain automationPracticeMain = new AutomationPracticeMain(driver);
        automationPracticeMain.clickContactUs();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        assertTrue(contactUsPage.isEmailVisible());
        contactUsPage.choosElementFromSubjectHeading();
        contactUsPage.addEmailAddress();
        contactUsPage.addOrder();
        contactUsPage.addMessage();
    }
}