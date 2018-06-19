package testproject.submityourapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testproject.util.WaitUtils;

import java.util.List;

public class submitYourApplicationTestSettings {
    private WebDriver driver;

    public submitYourApplicationTestSettings(WebDriver driver) {
        this.driver = driver;
    }


    public void clickButtonSubmit() {
        driver.findElement(By.cssSelector(".wpcf7-submit")).click();
    }

    public void refreshPage() {
        WaitUtils.waitUntilPresentAndVisible(driver,
                By.cssSelector("[title~=recaptcha]"));
        driver.findElement(By.cssSelector("[title~=recaptcha]"))
                .sendKeys(Keys.F5);
    }

    public void insertNameAndLastName(String name) {
        driver.findElement(By.cssSelector("[name=\"your-name\"]"))
                .sendKeys(name);
    }

    public void insertEmail(String email) {
        driver.findElement(By.cssSelector("[name=\"your-email\"]"))
                .sendKeys(email);
    }

    public void insertPhone(String phone) {
        driver.findElement(By.cssSelector("[name=\"your-phone\"]"))
                .sendKeys(phone);
    }

    public void insertLinkedInProfile(String linked) {
        driver.findElement(By.cssSelector("[name=\"linkedin\"]"))
                .sendKeys(linked);
    }

    public void selectFromPositionYouAreApplyingList(String ApplyPosition) {
        Select position = new Select(driver.findElement(By.cssSelector(".wpcf7-select")));
        position.selectByVisibleText(ApplyPosition);
    }

    public void uploadCv() {
        driver.findElement(By.cssSelector(".wpcf7-file"))
                .sendKeys("c:\\homework\\bin\\uploadfile\\mbsQA.pdf");
    }
}
