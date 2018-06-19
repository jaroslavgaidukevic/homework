package testproject.submityourapplication;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testproject.util.BaseIntegrationTest;

/**
 * Created by jaroslavg on 2018-05-04.
 */
public class submitYourApplicationTest extends
        BaseIntegrationTest {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        driver = openLoginPage();
    }

    @AfterClass
    public static void afterClass() {
       driver.close();
    }

    @Test
    public void fillCorrectlySubmitYourApplicationForm() {

        submitYourApplicationTestSettings settings = new submitYourApplicationTestSettings(driver);
        submitYourApplicationTestData testdata = submitYourApplicationTestData.data;

        settings.insertNameAndLastName(testdata.Name);

        settings.insertEmail(testdata.Email);

        settings.insertPhone(testdata.Phone);

        settings.selectFromPositionYouAreApplyingList(testdata.Position);

//        settings.uploadCv();

        settings.insertLinkedInProfile(testdata.LinkedIn);

//        settings.clickButtonSubmit();

    }
}
