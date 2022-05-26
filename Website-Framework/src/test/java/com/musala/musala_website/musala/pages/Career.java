package com.musala.musala_website.musala.pages;

import com.musala.musala_website.BasePage.BasePage;
import com.musala.musala_website.driver.WebDriverHandler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Career extends BasePage {

    @FindBy (xpath = "(//span[@data-alt='Check our open positions']")
    private WebElement CheckOpenPositionBtn;

    @FindBy (id = "(get_location")
    private WebElement LocationDropDownList;

    @FindBy (xpath = "//option[@value='Skopje']")
    private WebElement SkopjeOption ;

    String ExpectedJoinUsLink="https://www.musala.com/careers/join-us/";

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

    public WebElement getCheckOpenPositionBtn () { return CheckOpenPositionBtn; }
    public void ClickOnCheckOpenPositionBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", CheckOpenPositionBtn);}

    public WebElement getApplyBtn () { return ApplyBtn; }
    public void ClickOnApplyBtn(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", ApplyBtn);}

    public WebElement getLocationDropDownList () { return LocationDropDownList; }
    public void ClickOnLocationDropDownList(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", LocationDropDownList);}

    public void ChooseSkopjeOption() {
        Select dropDown = new Select(getLocationDropDownList());
        dropDown.selectByVisibleText("Skopje");
    }

    public WebElement getAutomationQaEngineer () { return AutomationQaEngineer; }
    public void ClickOnAutomationQaEngineer(){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", AutomationQaEngineer);}
    public WebElement getGeneralDescription () { return GeneralDescription; }
    public WebElement getRequirements () { return Requirements; }
    public WebElement getResponsibilities () { return Responsibilities; }
    public WebElement getWhatWeOffer () { return WhatWeOffer; }

}