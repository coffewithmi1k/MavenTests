package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        driver.findElement(By.xpath("/html/body/nav/div[4]/div/div[3]/div[2]/div[1]/a")).click();
        return new LogInPage(driver);
    }

}
