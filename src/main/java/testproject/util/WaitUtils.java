package testproject.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitUtils {
	private static final int TIMEOUT_IN_SECONDS = 5;
	private static final int NUMBER_OF_RETRIES = 2;

	public static void waitUntilPresentAndVisible(WebDriver driver, By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(presenceOfElementLocated(by));
		webDriverWait.until(visibilityOfElementLocated(by));
	}

	public static void waitUntilPresent(WebDriver driver, By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(presenceOfElementLocated(by));
	}

	public static void waitUntilNotPresent(final WebDriver driver, final By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(ExpectedConditions
				.not(presenceOfElementLocated(by)));
	}

	public static void waitUntilNotVisible(final WebDriver driver, final By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(ExpectedConditions
				.not(visibilityOfElementLocated(by)));
	}

	public static void waitUntilVisible(WebDriver driver, WebElement element) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(visibilityOf(element));
	}

	public static void waitUntilTextPresentByValue(final WebDriver driver, final By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.findElement(by).getAttribute("value").trim().length() != 0;
			}
		});
	}

	public static void waitUntilTextPresentByText(final WebDriver driver, final By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.findElement(by).getText().trim().length() != 0;
			}
		});
	}

	public static void waitUntilClickable(WebDriver driver, By by) {
		WebDriverWait webDriverWait = getWebDriverWait(driver);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public static WebDriverWait getWebDriverWait(WebDriver driver) {
		return new WebDriverWait(driver, TIMEOUT_IN_SECONDS, TIMEOUT_IN_SECONDS
				* 1000 / NUMBER_OF_RETRIES);
	}
}


