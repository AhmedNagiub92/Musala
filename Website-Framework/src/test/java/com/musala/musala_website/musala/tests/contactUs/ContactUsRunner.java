package com.musala.musala_website.musala.tests.contactUs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/musala/musala_website/tests/contactUs/ContactUs.feature",
        glue = {"com.musala.musala_website.musala.tests"},
        plugin = {"html:reports/contactUs-Website-Report.html"},
        monochrome = true
)
public class ContactUsRunner extends AbstractTestNGCucumberTests {
}
