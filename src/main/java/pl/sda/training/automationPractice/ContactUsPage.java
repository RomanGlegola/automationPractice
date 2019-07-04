package pl.sda.training.automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

    private WebDriver driver;

    private WebElement subjectHeading;
    private WebElement subjectHeadingSubElement;
    private WebElement email;
    private WebElement order;
    private WebElement message;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        subjectHeading = driver.findElement(By.cssSelector("#id_contact"));
        subjectHeadingSubElement = driver.findElement(By.cssSelector("#id_contact > option:nth-child(2)"));
        email = driver.findElement(By.cssSelector("#email"));
        order = driver.findElement(By.cssSelector("#id_order"));
        message = driver.findElement(By.cssSelector("#message"));
    }

    public boolean isSubjectHeadingVisible() {
        return WaitTools.isElementVisible(driver, subjectHeading);
    }

    public boolean isEmailVisible() {
        return WaitTools.isElementVisible(driver, email);
    }

    public boolean isOrderVisible() {
        return WaitTools.isElementVisible(driver, order);
    }

    public boolean isMessageVisible() {
        return WaitTools.isElementVisible(driver, message);
    }

    public void choosElementFromSubjectHeading() {
        subjectHeading.click();
        subjectHeadingSubElement.click();
    }

    public void addEmailAddress() throws InterruptedException {
        email.sendKeys("test@test.com");
    }
    public void addOrder() throws InterruptedException {
        order.sendKeys("0101010101010101010101010101010101010101");
    }
    public void addMessage() throws InterruptedException {
        message.sendKeys("0101010101010101010101010101010101010101");
        Thread.sleep(10_000);
    }

}