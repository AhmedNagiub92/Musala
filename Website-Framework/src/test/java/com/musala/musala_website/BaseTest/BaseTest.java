package com.musala.musala_website.BaseTest;

import com.musala.musala_website.browser.Browser;
import com.musala.musala_website.driver.WebDriverHandler;
import com.musala.musala_website.utilities.ConfigProperties;


public class BaseTest {
    protected WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static ConfigProperties data;
    protected static boolean once = true ;
    protected static String removeCharsExceptForDigitsAndDots(String string) {
        return string.replaceAll("[^0-9.]", "");
    }

}
