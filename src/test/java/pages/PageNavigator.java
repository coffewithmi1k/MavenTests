package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PageNavigator {
    WebDriver driver;

    public PageNavigator(WebDriver driver){
        this.driver = driver;
    }

//@Step("Navigate to home Page")
    public HomePage  getHomePage(){
        driver.get("https://sysla-stage.betavest53.no/");
        return new HomePage(driver);
    }
}
