package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Onboarding {

    public AppiumDriver driver;
    public Onboarding(AppiumDriver driver)
    {
        this.driver=driver;
    }

    By button_1= By.id("android:id/button2");
    public void click_button()
    {
        driver.findElement(button_1).click();
    }
    By button_2= MobileBy.AndroidUIAutomator("new UiSelector().text(\"Chaldal\")");
    public void click_button2()
    {
        driver.findElement(button_2).click();
    }
}
