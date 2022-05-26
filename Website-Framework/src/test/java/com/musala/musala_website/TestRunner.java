package com.musala.musala_website;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/musala/musala_website/tests",
        glue = {"com.musala.musala_website.musala.tests"},
        plugin = {"html:reports/musala-Website-Report.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
