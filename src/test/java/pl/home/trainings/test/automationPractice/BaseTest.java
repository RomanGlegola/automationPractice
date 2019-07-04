package pl.home.trainings.test.automationPractice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public abstract class BaseTest {
    protected static WebDriver driver;

    @BeforeClass
    public static void browserSetup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Czekacz "implicity wait" czekamy dany czas
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
