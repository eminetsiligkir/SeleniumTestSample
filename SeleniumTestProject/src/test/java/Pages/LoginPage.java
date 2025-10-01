package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.ElementHelper;

public class LoginPage {
    ElementHelper helper;
    public LoginPage(RemoteWebDriver driver){
        this.helper = new ElementHelper(driver);
    }

    By anaEkran = By.xpath("/html/body");
    By girisYapButton = By.id("myAccount");
    By girisYapButton2 = By.id("login");
    By usernameTextbox = By.id("txtUserName");
    By usernameCorrectTextbox = By.id("txtUserName");

    By loginPageGirisButton = By.id("btnLogin");
    By wrongMAdress = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[2]");
    By passwordTextbox = By.id("txtPassword");
    By wrongPasswordMessage = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/div/div/div[4]/div/div/div[1]/div[2]");
    By girisButtonSifre = By.id("btnEmailSelect");

    public void anaEkran(){
        helper.checkElementPresence(anaEkran);
    }
    public void girisYap(){
        helper.mouseHover(girisYapButton);
        helper.checkElementPresence(girisYapButton2);
        helper.click(girisYapButton2);
    }
    public void fillUsername(){
       // helper.checkElementPresence(usernameTextbox);
        helper.click(usernameTextbox);
        helper.sendKey(usernameTextbox, "emine.cilingasdkjah@hotmail.com");
    }
    public void LoginPageGiris(){
        helper.click(loginPageGirisButton);
    }
    public void wrongPasswordAdress(){
        helper.scrollIntoView(wrongPasswordMessage);
        helper.checkElementPresence(wrongPasswordMessage);
       helper.checkText(wrongPasswordMessage, "Beklenmeyen bir hata oluştu.");
    }
    public void passwordLogin(){
        helper.click(passwordTextbox);
        helper.sendKey(passwordTextbox,"aAA1234852");
    }
    public void passwordLoginPageCheck(){
       // helper.checkText(passwordPage,"Hoş geldiniz");
    }
    public void afterpasswordGiris(){
        helper.scrollIntoView(girisButtonSifre);
        helper.click(girisButtonSifre);
    }
    public void fillCorrectUsername (){
        helper.click(usernameCorrectTextbox);
        helper.sendKey(usernameCorrectTextbox, "emine.cilingir@hotmail.com");
    }
    public void correctPasswordLogin(){
        helper.click(passwordTextbox);
        helper.sendKey(passwordTextbox,"Deneme123.");
    }
    public void wrongMAdrress(){
        helper.checkElementPresence(wrongMAdress);
        helper.checkText(wrongMAdress,"E-posta adresi eksik veya hatalı.");
    }
}
