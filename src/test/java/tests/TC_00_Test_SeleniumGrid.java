package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TC_00_Test_SeleniumGrid {

    @Parameters("browser")
    @Test
    public void Test_Selenium_Driver(String browser) throws MalformedURLException {
        // Hub URL
        String hubUrl = "http://localhost:4444/wd/hub";

        // Desired capabilities for Chrome
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);

        // Initialize WebDriver with Grid URL and capabilities
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), capabilities);

        // Perform test
        driver.get("https://www.google.com");
        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }


}
