package com.musala.musala_website.musala.pages;

import com.musala.musala_website.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Company extends BasePage {
    @FindBy(xpath = "//span[@class='musala musala-icon-facebook']")
    private WebElement FacebookIcon;

    @FindBy(xpath = "//h2[normalize-space()='Leadership']")
    private WebElement LeadershipSection;

    public String CompanyTabExpectedURL="https://www.musala.com/company/";




    public void ClickOnFacebookIcon(){ FacebookIcon.click();}
    public WebElement getFacebookIcon(){return FacebookIcon;}
    public WebElement getLeadershipSection(){return LeadershipSection;}

}
