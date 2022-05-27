package website.musala.tests;

import website.BaseTest.BaseTest;
import io.cucumber.java.en.Given;

public class CommonStepDefs extends BaseTest {

    @Given("website is opened")
    public void websiteIsOpened() throws InterruptedException {
        browser.website.home.ClickOnAcceptCookiesBtn();
        Thread.sleep(3000);
    }
}
