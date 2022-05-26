package com.musala.musala_website.musala.tests.companyTab;

import com.musala.musala_website.BaseTest.BaseTest;
import com.musala.musala_website.driver.WebDriverHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CompanyTabStepdef extends BaseTest {

    @When("click on company tab")
    public void clickOnCompanyTab() {
        browser.website.home.ClickOnCompanyTab();

    }

    @Then("assert the url is opened")
    public void assertTheUrlIsOpened() {
            assertEquals((WebDriverHandler.getWebDriver().getCurrentUrl()),(browser.website.company.CompanyTabExpectedURL));
    }

    @And("assert leadership section is displayed")
    public void assertLeadershipSectionIsDisplayed() {
        browser.website.home.scrollTo(browser.website.company.getLeadershipSection());
        assertTrue(browser.website.company.getLeadershipSection().isDisplayed());
    }

    @When("Click the Facebook link from the footer")
    public void clickTheFacebookLinkFromTheFooter() {
        browser.website.home.scrollTo(browser.website.company.getFacebookIcon());
        browser.website.company.ClickOnFacebookIcon();
    }

    @Then("Verify that the correct URL loads")
    public void verifyThatTheCorrectURLLoads() {
        assertEquals((WebDriverHandler.getWebDriver().getCurrentUrl()),(browser.website.facebook.FacebookExpectedURL));

    }

    @And("verify if the Musala Soft profile picture appears on the new page")
    public void verifyIfTheMusalaSoftProfilePictureAppearsOnTheNewPage() {
        assertTrue(browser.website.facebook.getProfilePicture().isDisplayed());

    }
}
