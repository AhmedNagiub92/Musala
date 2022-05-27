package website.musala.tests;

import website.BaseTest.BaseTest;
import io.cucumber.java.en.When;

public class CommonStepDefs extends BaseTest {

    @When("website is opened")
    public void websiteIsOpened() throws InterruptedException {
        browser.website.home.ClickOnAcceptCookiesBtn();
        Thread.sleep(5000);
    }
}
