package website.musala.tests.contactUs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/website/musala/tests/contactUs"},
        glue = {"website.musala.tests"},
        plugin = {"html:reports/contactUs-Website-Report.html"},
        monochrome = true
)
public class ContactUsRunner extends AbstractTestNGCucumberTests {
}
