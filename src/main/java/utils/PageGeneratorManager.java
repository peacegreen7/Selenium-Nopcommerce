package utils;

import org.openqa.selenium.WebDriver;
import pages.HomePageObject;
import pages.RegisterPageObject;

public class PageGeneratorManager {

    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }
}
