package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.PageGeneratorManager;

import static pageUIs.HomePageUI.REGISTER_XPATH;

public class HomePageObject {

    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public RegisterPageObject openRegisterPage(WebDriver driver) {
        WebElement registerLink = driver.findElement(By.xpath(REGISTER_XPATH));
        registerLink.click();
        return PageGeneratorManager.getRegisterPage(driver);
    }
}
