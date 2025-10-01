package util;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    PropertiesFactory PropertiesFactory = new PropertiesFactory();

    public void initDriver(String browser){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions options = new EdgeOptions();
                options.addArguments("-inprivate");
                driver = new EdgeDriver(options);
                break;
            default:
                Assert.isTrue(false,"wrong browser");
                break;
        }
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(PropertiesFactory.getUrl());
    }
    public void closeDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
