package website.browser;

import website.musala.MusalaWebsite;
import website.driver.WebDriverHandler;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Browser {

    private final WebDriver webDriver = WebDriverHandler.getWebDriver();

    public MusalaWebsite website;

    public Browser() {
        website = new MusalaWebsite();
    }

    public void sendLink(String link) {
        webDriver.get(link);
    }

    public void swipeTo(WebElement targetElement) {
        Actions action = new Actions(webDriver);
        action.dragAndDropBy(targetElement, 200, 0).build().perform();
    }

    public int getXCoordinate(WebElement element){
        Point elementPoint = element.getLocation();
        return elementPoint.getX();
    }
}
