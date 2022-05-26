package com.musala.musala_website.musala.tests.careerTab;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/musala/musala_website/musala/tests/careerTab/CareerTab.feature",
        glue = {"com.musala.musala_website.musala.tests.careerTab"},
        plugin = {"html:reports/CareerTab-Website-Report.html"},
        monochrome = true
)
public class CareerTabRunner extends AbstractTestNGCucumberTests {
}
