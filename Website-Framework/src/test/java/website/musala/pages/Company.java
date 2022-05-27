package website.musala.pages;

import org.openqa.selenium.JavascriptExecutor;
import website.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import website.driver.WebDriverHandler;

public class Company extends BasePage {
    @FindBy(xpath = "//span[@class='musala musala-icon-facebook']")
    private WebElement FacebookIcon;

    @FindBy(xpath = "//h2[normalize-space()='Leadership']")
    private WebElement LeadershipSection;

    public String CompanyTabExpectedURL="https://www.musala.com/company/";




    public WebElement getFacebookIcon(){return FacebookIcon;}
    public void ClickOnFacebookIcon (){((JavascriptExecutor) WebDriverHandler.getWebDriver()).executeScript("arguments[0].click()", getFacebookIcon());}

    public WebElement getLeadershipSection(){return LeadershipSection;}

}
