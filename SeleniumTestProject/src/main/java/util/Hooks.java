package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    DriverFactory DriverFactory = new DriverFactory();
    PropertiesFactory propertiesFactory = new PropertiesFactory();

    @Before
    public void before(){
        DriverFactory.initDriver(PropertiesFactory.getBrowser());
    }
    @After
    public void after(){
        DriverFactory.closeDriver();
    }
}
