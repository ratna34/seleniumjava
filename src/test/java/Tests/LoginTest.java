package Tests;

import PageObject.LoginPage.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test
    public void testWithValidCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsernName();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
        loginPage.vaidateDashboardTitle();
        loginPage.validateUrl("overview");
    }
}
