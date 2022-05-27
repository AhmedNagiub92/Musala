package website.musala;

import website.BasePage.BasePage;
import website.musala.pages.*;

public class MusalaWebsite extends BasePage {

    public Company company;
    public Home home ;
    public Facebook facebook;
    public ContactUs contactUs;
    public Career career;

    public MusalaWebsite()
    {
        home = new Home();
        contactUs =new ContactUs();
        company = new Company();
        facebook = new Facebook();
        career = new Career();

    }
}
