package com.musala.musala_website.musala.tests.careerTab;

import com.musala.musala_website.BaseTest.BaseTest;
import com.musala.musala_website.driver.WebDriverHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class CareerTabStepdef extends BaseTest {



    @When("click on career tab")
    public void clickOnCareerTab() {
        browser.website.home.ClickOnCareerTab();
    }

    @And("Click ‘Check our open positions’ button")
    public void clickCheckOurOpenPositionsButton() {
        browser.website.career.ClickOnCheckOpenPositionBtn();
    }

    @Then("Verify that ‘Join Us’ page is opened")
    public void verifyThatJoinUsPageIsOpened() {
    }

    @When("Select location From the dropdown")
    public void selectLocationFromTheDropdown() {
        browser.website.career.ChooseSkopjeOption();
    }



    @And("Choose open position by name")
    public void chooseOpenPositionByName() {
        browser.website.career.ClickOnAutomationQaEngineer();
    }

    @Then("Verify that General Description sections is shown")
    public void verifyThatGeneralDescriptionSectionsIsShown() {
       assertTrue( browser.website.career.getGeneralDescription().isDisplayed());
    }

    @And("Verify that Requirements sections is shown")
    public void verifyThatRequirementsSectionsIsShown() {
        assertTrue(  browser.website.career.getRequirements().isDisplayed());
    }

    @And("Verify that Responsibilities sections is shown")
    public void verifyThatResponsibilitiesSectionsIsShown() {
        assertTrue(  browser.website.career.getResponsibilities().isDisplayed());

    }

    @And("Verify that What we offer sections is")
    public void verifyThatWhatWeOfferSectionsIs() {
        assertTrue(  browser.website.career.getWhatWeOffer().isDisplayed());

    }

    @And("Verify that ‘Apply’ button is present at the bottom")
    public void verifyThatApplyButtonIsPresentAtTheBottom() {
        assertTrue(  browser.website.career.getApplyBtn().isDisplayed());

    }

    @And("Click ‘Apply’ button")
    public void clickApplyButton() {
        browser.website.career.ClickOnApplyBtn();
    }
}
