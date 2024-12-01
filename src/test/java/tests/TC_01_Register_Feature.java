package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageObject;
import pages.RegisterPageObject;
import utils.PageGeneratorManager;

public class TC_01_Register_Feature extends BaseTest {

    WebDriver driver;
    String url = "https://demo.nopcommerce.com/";
    HomePageObject homePage;
    RegisterPageObject registerPage;

    @BeforeMethod
    public void before() {
        driver = openBrowser(url);
        homePage = PageGeneratorManager.getHomePage(driver);
        registerPage = homePage.openRegisterPage(driver);
        System.out.println("Register page title is: " + registerPage.getPageTitle(driver));
    }

    @Test
    public void TC_01_Register_With_Empty_Data() {
        System.out.println(driver.getTitle());
        registerPage.clickOnRegisterButton(driver);
        Assert.assertEquals(registerPage.getValidateFirstNameFiledText(driver), "First name is required.");

    }

    @AfterMethod
    public void after() {
        close();
    }
}
