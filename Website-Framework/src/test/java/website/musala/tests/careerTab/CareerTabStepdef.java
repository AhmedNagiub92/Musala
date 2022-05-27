package website.musala.tests.careerTab;

import website.BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import website.driver.WebDriverHandler;

import static org.testng.Assert.assertEquals;
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
        assertEquals((WebDriverHandler.getWebDriver().getCurrentUrl()),(browser.website.career.ExpectedJoinUsLink));
    }

    @When("Select location From the dropdown")
    public void selectLocationFromTheDropdown() {
        browser.website.career.ClickOnLocationDropDownList();
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

    @And("Fill with {string} with {string} with {string}")
    public void fillWithWithWith(String arg0, String arg1, String arg2) {
        browser.website.career.getName().sendKeys(data.getProperty(arg0));
        browser.website.career.getEmail().sendKeys(data.getProperty(arg1));
        browser.website.career.getMobile().sendKeys(data.getProperty(arg2));



    }

    @And("Upload a file")
    public void uploadAFile() {
        browser.website.career.getCVUpload().sendKeys("D://Musala//Musala Soft Test Automation Task - 12.2021.pdf");


    }

    @And("check the agreement and recaptcha")
    public void checkTheAgreementAndRecaptcha() throws InterruptedException {
        browser.website.career.ClickOnAgreementCheck();
        Thread.sleep(3000);
        browser.website.career.ClickOnSendBtn();
        Thread.sleep(3000);
        browser.website.career.ClickOnCloseFormBtn();
    }

    @Then("Verify error are handeled")
    public void verifyErrorAreHandeled() {
        assertTrue(browser.website.career.getMissingFieled().isDisplayed());
        assertTrue(browser.website.career.getEmailError().isDisplayed());

    }
}
