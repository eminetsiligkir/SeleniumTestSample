package Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.ElementHelper;

public class LogoutPage {
    ElementHelper helper;
    public LogoutPage(RemoteWebDriver driver){
        this.helper = new ElementHelper(driver);
    }

    By goMainScreen = By.xpath("//*[@id=\"oldHeader_21ff9203-7c49-4696-f004-f8182a502ede\"]/div/div[1]/div[3]/div[1]/div/div[1]/a/svg/path");
    By accountButton = By.id("myAccount");
    By exitButton = By.id("myAccount");

    public void mainScreen(){
        helper.click(goMainScreen);
    }
    public void loguotFrom(){
        helper.mouseHover(accountButton);
        helper.checkElementPresence(exitButton);
        helper.click(exitButton);
    }
    public void checkSuccessLogout(){
        helper.checkText(accountButton,"Giriş Yap");
    }

}
