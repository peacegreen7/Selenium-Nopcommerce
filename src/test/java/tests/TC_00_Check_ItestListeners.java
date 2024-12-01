package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class TC_00_Check_ItestListeners {

    WebDriver driver;


    @BeforeMethod
    public void setUp(ITestContext context) {
        driver = new ChromeDriver();
        context.setAttribute("WebDriver", driver);
    }

    @Test
    public void TC_01_Pass(@Optional("chrome") String browser) {

        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
    }

    @Test
    public void TC_02_Failed() {
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(), "hihi test");
        driver.quit();
    }
}
