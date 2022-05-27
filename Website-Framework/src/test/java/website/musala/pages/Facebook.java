package website.musala.pages;

import website.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Facebook extends BasePage {

    public String FacebookExpectedURL="https://www.facebook.com/MusalaSoft?fref=ts";

    @FindBy(xpath = "//a[@aria-label='Musala Soft profile photo']//div[@class='q9uorilb l9j0dhe7 pzggbiyp du4w35lb']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")
    private WebElement ProfilePicture ;


    public WebElement getProfilePicture(){return ProfilePicture;}


}
