package com.musala.musala_website.musala.tests.companyTab;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/musala/musala_website/tests/companyTab",
        glue = {"com.musala.musala_website.musala.tests"},
        plugin = {"html:reports/companyTab-Website-Report.html"},
        monochrome = true
)
public class CompanyTabRunner extends AbstractTestNGCucumberTests {
}
