package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    PropertiesFactory PropertiesFactory = new PropertiesFactory();

    public ElementHelper(RemoteWebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(PropertiesFactory.getWait()));
    }

    public WebElement scrollElement(By by){
        checkElementPresence(by);
        WebElement element = driver.findElement(by);
        return element;
    }
    public void click(By by){
        scrollElement(by).click();
    }
    public void sendKey(By by, String text){
        scrollElement(by).sendKeys(text);
    }
    public String getText(By by){
        String text = scrollElement(by).getText();
        return text;
    }
    public void checkElementPresence(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public boolean checkText(By by, String expectedText){
        checkElementPresence(by);
        WebElement element = driver.findElement(by);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }
    public void scrollIntoView(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void mouseHover(By by){
        WebElement element = driver.findElement(by);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).build().perform();
        //Point location = element.getLocation();
       // builder.moveToElement(element, location.x, location.y).build().perform();
    }
}
