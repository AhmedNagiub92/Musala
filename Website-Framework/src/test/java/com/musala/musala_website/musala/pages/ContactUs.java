package com.musala.musala_website.musala.pages;

import com.musala.musala_website.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends BasePage {

    @FindBy(id = "cf-1")
    private WebElement Name;

    @FindBy(id = "cf-2")
    private WebElement Email;

    @FindBy(id = "cf-3")
    private WebElement Mobile;

    @FindBy(id = "cf-4")
    private WebElement Subject;

    @FindBy(id = "cf-5")
    private WebElement Message;

    @FindBy(className = "recaptcha-checkbox-border")
    private WebElement Recaptcha;

    @FindBy(xpath = "//input[@value='Send']")
    private WebElement SendBtn;

    @FindBy(className = "wpcf7-response-output")
    private WebElement GenericError;

    @FindBy(className = "wpcf7-not-valid-tip")
    private WebElement EmailError;

    public WebElement getName(){return Name;}
    public WebElement getEmail(){return Email;}
    public WebElement getMobile(){return Mobile;}
    public WebElement getSubject(){return Subject;}
    public WebElement getMessage(){return Message;}
    public WebElement getRecaptcha(){return Recaptcha;}
    public WebElement getSendBtn(){return SendBtn;}
    public void ClickOnSendBtn (){SendBtn.click();}
    public WebElement getGenericError(){return GenericError;}
    public WebElement getEmailError(){return EmailError;}

}
