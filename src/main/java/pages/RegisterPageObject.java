package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageUIs.RegisterPageUI.FIRST_NAME_VALIDATE_XPATH;
import static pageUIs.RegisterPageUI.REGISTER_BUTTON_XPATH;

public class RegisterPageObject {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPageObject(WebDriver driver) {
    }

    public String getPageTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public void clickOnRegisterButton(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(REGISTER_BUTTON_XPATH)));
        btn.click();
    }

    public String getValidateFirstNameFiledText(WebDriver driver) {
        WebElement firstNameRequire = driver.findElement(By.xpath(FIRST_NAME_VALIDATE_XPATH));
        return firstNameRequire.getText();
    }

}
