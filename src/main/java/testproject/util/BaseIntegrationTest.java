package testproject.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseIntegrationTest {

    public static WebDriver openLoginPage() {
        WebDriver driver = createDriver();
        driver.get("https://www.metasite.net/careers/qa-engineer/");
      //  driver.get("https://www.google.lt/");
        return driver;
    }

    public static WebDriver createDriver() {

        // CHROME DRIVER

        System.setProperty("webdriver.chrome.driver",
                "bin/selenium/chrome-driver/latest/chromedriver.exe");
        ChromeOptions
                options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }

    public BaseIntegrationTest() {
        super();
    }

}