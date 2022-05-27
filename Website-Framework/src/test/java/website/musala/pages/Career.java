package website.musala.pages;

import website.BasePage.BasePage;
import website.driver.WebDriverHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Career extends BasePage {

    @FindBy (xpath = "//span[@data-alt='Check our open positions']")
    private WebElement CheckOpenPositionBtn;

    @FindBy (id = "get_location")
    private WebElement LocationDropDownList;

    @FindBy (xpath = "//option[@value='Skopje']")
    private WebElement SkopjeOption ;

    public String ExpectedJoinUsLink="https://www.musala.com/careers/join-us/";

    @FindBy (xpath = " //h2[normalize-space()='Automation QA Engineer']")
    private WebElement AutomationQaEngineer ;

    @FindBy (xpath = "//h2[normalize-space()='General description']")
    private WebElement GeneralDescription ;

    @FindBy (xpath = "//h2[normalize-space()='Requirements']")
    private WebElement Requirements ;

    @FindBy (xpath = "//h2[normalize-space()='Responsibilities']")
    private WebElement Responsibilities ;

    @FindBy (xpath = "//h2[normalize-space()='What we offer']")
    private WebElement WhatWeOffer ;

    @FindBy (xpath = "//input[@value='Apply']")
    private WebElement ApplyBtn ;

    @FindBy (xpath = "//input[@value='Send']")
    private WebElement SendBtn ;

    @FindBy (xpath = "//button[@class='close-form']")
    private WebElement CloseFormBtn ;

    @FindBy (xpath = "//span[contains(text(),'The e-mail address entered is invalid.')]")
    private WebElement EmailError ;

    @FindBy (xpath = "//span[contains(text(),'The telephone number is invalid.')]")
    private WebElement MobileError ;

    @FindBy (id = "adConsentChx")
    private WebElement AgreementCheck ;

    @FindBy (xpath = "//span[@class='wpcf7-form-control-wrap your-name']//span[@class='wpcf7-not-valid-tip'][normalize-space()='The field is required.']")
    private WebElement MissingFieled ;

    @FindBy(id = "cf-1")
    private WebElement Name;

    @FindBy(id = "cf-2")
    private WebElement Email;

    @FindBy(id = "cf-3")
    private WebElement Mobile;

    @FindBy(id = "uploadtextfield")
    private WebElement CVUpload;

    @FindBy(className = "recaptcha-checkbox-border")
    private WebElement RecaptchaCheckbox;

    public WebElement getCheckOpenPositionBtn () { return CheckOpenPositionBtn; }
    public void ClickOnCheckOpenPositionBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", CheckOpenPositionBtn);}

    public WebElement getApplyBtn () { return ApplyBtn; }
    public void ClickOnApplyBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", ApplyBtn);}

    public WebElement getSendBtn () { return SendBtn; }
    public void ClickOnSendBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", SendBtn);}
    public void ClickOnCloseFormBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", getCloseFormBtn());}

    public WebElement getLocationDropDownList () { return LocationDropDownList; }
    public void ClickOnLocationDropDownList(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", LocationDropDownList);}

    public void ChooseSkopjeOption() {
        Select dropDown = new Select(getLocationDropDownList());
        dropDown.selectByVisibleText("Skopje");
    }

    public WebElement getAutomationQaEngineer () { return AutomationQaEngineer; }
    public WebElement getName(){return Name;}
    public WebElement getEmail(){return Email;}
    public WebElement getMobile(){return Mobile;}
    public WebElement getCVUpload () { return CVUpload; }
    public WebElement getRecaptchaCheckbox() { return RecaptchaCheckbox; }
    public void ClickOnRecaptchaCheckbox(){

        ((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", RecaptchaCheckbox);
    }

    public WebElement getMissingFieled () { return MissingFieled; }
    public WebElement getAgreementCheck () { return AgreementCheck; }
    public void ClickOnAgreementCheck(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", AgreementCheck);}

    public WebElement getMobileError () { return MobileError; }
    public WebElement getCloseFormBtn () { return CloseFormBtn;};
    public WebElement getEmailError() { return EmailError; }

    public void ClickOnAutomationQaEngineer(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", AutomationQaEngineer);}
    public WebElement getGeneralDescription () { return GeneralDescription; }
    public WebElement getRequirements () { return Requirements; }
    public WebElement getResponsibilities () { return Responsibilities; }
    public WebElement getWhatWeOffer () { return WhatWeOffer; }

}