package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomePage  extends PageNavigator{

    public HomePage(WebDriver driver){
        super(driver);
    }



//@Step("Get title to check that page is opened")
    public String checkHomePageOpened(){


    return driver.getTitle();
    }
    public LogInPage navigateToLogInPage(){
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"onesignal-popover-cancel-button\"]")));
        driver.findElement(By.xpath("//*[@id=\"onesignal-popover-cancel-button\"]")).click();
        WebElement myDynamicElement2 = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("spid-do-login")));
        driver.findElement(By.className("spid-do-login")).click();
        return new LogInPage(driver);
    }

}
