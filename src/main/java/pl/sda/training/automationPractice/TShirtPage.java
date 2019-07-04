package pl.sda.training.automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TShirtPage {

    private WebDriver driver;
    private WebElement tshirtLabel;

    public TShirtPage(WebDriver driver) {
        this.driver = driver;
        tshirtLabel = driver.findElement(By.cssSelector(".cat-name"));
    }

    public boolean isTshirtLabelVisible() {
        return tshirtLabel.isDisplayed();
    }
}
