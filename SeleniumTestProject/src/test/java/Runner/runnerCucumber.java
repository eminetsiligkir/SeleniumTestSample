package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        glue = {"StepDefinitions","util"},
        features = {"src/test/java/Features"},
        tags = "@Test")
//dryRun = false

public class runnerCucumber extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() { return super.scenarios();}
}