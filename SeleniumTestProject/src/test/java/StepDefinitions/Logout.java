package StepDefinitions;
import Pages.LoginPage;
import Pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.DriverFactory;

public class Logout {
    LogoutPage LogoutPages = new LogoutPage((RemoteWebDriver) DriverFactory.getDriver());
    LoginPage LoginPages = new LoginPage((RemoteWebDriver) DriverFactory.getDriver());
    @Given("user is on main screenn")
    public void userIsOnMainScreenn() {
        LoginPages.girisYap();
        LoginPages.fillCorrectUsername();
        LoginPages.LoginPageGiris();
        LoginPages.passwordLoginPageCheck();
        LoginPages.correctPasswordLogin();
        LoginPages.afterpasswordGiris();
        LogoutPages.mainScreen();
    }
    @When("User logout from page")
    public void userLogoutFromPage() {
        LogoutPages.loguotFrom();
    }

    @Then("successfully logout from page")
    public void successfullyLogoutFromPage() {
        LogoutPages.checkSuccessLogout();
    }
}
