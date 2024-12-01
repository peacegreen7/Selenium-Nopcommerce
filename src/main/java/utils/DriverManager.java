package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    // Thread-safe Singleton using ThreadLocal for parallel execution
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Private constructor to prevent instantiation
    private DriverManager() {
    }

    // Public method to get the WebDriver instance
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            // Initialize WebDriver if not already done
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }

    // Method to quit the WebDriver
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Remove the ThreadLocal value
        }
    }
}
