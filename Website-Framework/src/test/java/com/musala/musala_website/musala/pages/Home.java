package com.musala.musala_website.musala.pages;

import com.musala.musala_website.BasePage.BasePage;
import com.musala.musala_website.driver.WebDriverHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;
public class Home extends BasePage {
    @FindBy (id = "wt-cli-accept-all-btn")
    private WebElement AcceptCookiesBtn;

    @FindBy(xpath = "//span[@data-alt='Contact us']")
    private WebElement ContactUsBtn ;

    @FindBy(id = "musala musala-icon-youtube")
    private WebElement YoutubeIcon ;

    @FindBy(linkText = "Company")
    private WebElement CompanyTab;

    @FindBy(linkText = "Careers")
    private WebElement CareerTab;


    public void ClickOnAcceptCookiesBtn(){
        AcceptCookiesBtn.click();}
    public WebElement getCompanyTab(){return CompanyTab;}
    public void ClickOnCompanyTab (){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", CompanyTab);}
    public WebElement getCareerTab(){return CareerTab;}
    public void ClickOnCareerTab (){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", CareerTab);}

    public WebElement getContactUsBtn(){return ContactUsBtn;}
    public void ClickOnContactUsBtn (){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", ContactUsBtn);}
    public WebElement getYoutubeIcon(){return YoutubeIcon;}



}
