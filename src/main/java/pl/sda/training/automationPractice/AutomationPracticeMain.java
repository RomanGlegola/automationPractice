package pl.sda.training.automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationPracticeMain {

    private WebDriver driver;
    private WebElement tshirtButton;
    private WebElement contactUs;
    private WebElement contactUsAlt;

    public AutomationPracticeMain(WebDriver driver) {
        this.driver = driver;
        tshirtButton =
                driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
        contactUs =
                driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        contactUsAlt = driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
    }

    public void clickTshirtButton() {
        WaitTools.isElementVisible(driver, tshirtButton);
        tshirtButton.click();
    }

    public void clickContactUs() {
        contactUsAlt.click();
    }
}