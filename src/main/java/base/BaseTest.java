package base;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class BaseTest {
    private WebDriver driver;

    public WebDriver openBrowser(String URL) {
        driver = DriverManager.getDriver();
        driver.get(URL);
        return driver;
    }

    public void close() {
        DriverManager.quitDriver();
    }

}
