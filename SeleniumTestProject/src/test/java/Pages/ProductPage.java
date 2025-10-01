package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import util.ElementHelper;

public class ProductPage {
    ElementHelper helper;
    public ProductPage(RemoteWebDriver driver){
        this.helper = new ElementHelper(driver);
    }


}
