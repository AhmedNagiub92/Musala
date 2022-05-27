package website;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/musala/website/tests",
        glue = {"website.musala.tests"},
        plugin = {"html:reports/musala-Website-Report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
