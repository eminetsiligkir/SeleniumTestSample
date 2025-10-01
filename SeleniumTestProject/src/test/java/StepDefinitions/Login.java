package StepDefinitions;

import util.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Login {
    LoginPage LoginPages = new LoginPage((RemoteWebDriver)DriverFactory.getDriver());
    @Given("user is on login page")
    public void userIsOnLoginPage() {
       // LoginPages.anaEkran();
        LoginPages.girisYap();
    }

    @When("user fill the username address on login page")
    public void userFillTheUsernameAddressOnLoginPage() {
        LoginPages.fillCorrectUsername();
    }

    @When("user click to giris button on login page")
    public void userClickToGirisButtonOnLoginPage() {
        LoginPages.afterpasswordGiris();
    }

    @Then("successfully addressed to password page on login page")
    public void successfullyAddressedToPasswordPageOnLoginPage() {
        LoginPages.passwordLoginPageCheck();
    }

    @When("user fill the wrong password on login page")
    public void userFillTheWrongPasswordOnLoginPage() {
        LoginPages.passwordLogin();
    }

    @Then("giris button is available on login page")
    public void girisButtonIsAvailableOnLoginPage() {
       // LoginPages.afterpasswordGiris();
    }

    @Then("Error message will disappear")
    public void errorMessageWillDisappear() {
        LoginPages.wrongPasswordAdress();
    }

    @When("user fill the wrong username address on login page")
    public void userFillTheWrongUsernameAddressOnLoginPage() {
        LoginPages.fillUsername();
    }

    @When("user fill the password on login page")
    public void userFillThePasswordOnLoginPage() {
        LoginPages.correctPasswordLogin();
    }

    @Then("login is successfully")
    public void loginIsSuccessfully() {
    }

    @When("user fill the correct username address on login page")
    public void userFillTheCorrectUsernameAddressOnLoginPage() {
        LoginPages.fillCorrectUsername();
    }

    @When("user click to giris button on password page")
    public void userClickToGirisButtonOnPasswordPage() {

        LoginPages.afterpasswordGiris();
    }

    @When("popup accept")
    public void popupAccept() {
    }

    @When("user click to giris button on login email page")
    public void userClickToGirisButtonOnLoginEmailPage() {
        LoginPages.LoginPageGiris();
    }

    @Then("Error message will disappear on wrong email page")
    public void errorMessageWillDisappearOnWrongEmailPage() {
        LoginPages.wrongMAdrress();
    }


}
