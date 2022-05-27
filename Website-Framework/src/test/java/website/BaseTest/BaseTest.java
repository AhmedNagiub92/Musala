package website.BaseTest;

import website.browser.Browser;
import website.driver.WebDriverHandler;
import website.utilities.ConfigProperties;


public class BaseTest {
    protected WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static ConfigProperties data;
    protected static boolean once = true ;
    protected static String removeCharsExceptForDigitsAndDots(String string) {
        return string.replaceAll("[^0-9.]", "");
    }

}
