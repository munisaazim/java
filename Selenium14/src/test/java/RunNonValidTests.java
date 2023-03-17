import PageObjects.LoginPage;
import TestComponents.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RunNonValidTests extends BaseTest {
    LoginPage loginPage;

    @BeforeTest(alwaysRun = true)
    public void setUp() throws IOException {
        launchApplication();
        loginPage = new LoginPage(driver);
    }
    @Test(groups = {"ErrorValidation"})
    public void check(){
        loginPage.nonValidCredentialsLoginPage();
    }
    @AfterTest(alwaysRun = true)
    public void quitBrowser(){
        quit();
    }

}
