package com.musala.musala_website.musala.tests.contactUs;

import com.musala.musala_website.BaseTest.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class ContactUsStepdef extends BaseTest {
        @When("Scroll down and go to ‘Contact Us’")
        public void scroll_down_and_go_to_contact_us(){
                browser.website.home.scrollTo(browser.website.home.getContactUsBtn());
                browser.website.home.ClickOnContactUsBtn();
    }

    @And("Fill all required fields except email")
    public void fillAllRequiredFieldsExceptEmail() {
            browser.website.contactUs.getName().sendKeys("Ahmed Nagiub");
            browser.website.contactUs.getMobile().sendKeys("01000000000");
            browser.website.contactUs.getMessage().sendKeys("test");
            browser.website.contactUs.getSubject().sendKeys("test");
    }

    @And("Under email field enter string with wrong email format {string}")
    public void underEmailFieldEnterStringWithWrongEmailFormat(String arg0) {
        browser.website.contactUs.getEmail().sendKeys(data.getProperty(arg0));
    }

    @And("Click ‘Send’ button")
    public void clickSendButton() {
        browser.website.contactUs.ClickOnSendBtn();
    }

    @Then("error message ‘The e-mail address entered is invalid.’ appears")
    public void errorMessageTheEMailAddressEnteredIsInvalidAppears() {
            assert (browser.website.contactUs.getGenericError()).isDisplayed();
            assertEquals(true, browser.website.contactUs.getEmailError().isDisplayed());
    }
}
