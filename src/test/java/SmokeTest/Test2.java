package SmokeTest;


import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.PageNavigator;
import pages.RegisterPage;



import java.sql.Driver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

@Epic("Smoke tests")
@Feature("My First Tests scenarious")
public class Test2 extends TNav {



    @Test(description = "Check that home Page is opened")
    @Step("Verify Home Page is opened")
    public void getHomePage(){
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.getHomePage();
        Assert.assertTrue(onHomePage.checkHomePageOpened().contains("Sysla - SYSLA"));
      // assertThat(driver.findElement(By.xpath("/html/body/nav/div[59]/div/div[3]/div[1]/a")).getText(), is("bli abonnent"));
       // assertThat(onHomePage.checkHomePageOpened(), is("Sysla - SYSLAd"));
        //check here, when test fails , in report this step is not marked as fail;
    }


    @Test(description = "Check Log in with valid creds")
    public void checkLoginWithValidCreds(){
        PageNavigator pn = new PageNavigator(driver);
        LogInPage onLogInPage = pn.getHomePage().navigateToLogInPage();
        onLogInPage.fillTheFormWithValidCreds();
        Assert.assertTrue(onLogInPage.verifyUserLoggedSuccessfully().getText().contains("asdasd"));
    }
    @Test(description = "Check successfull registration of a user")
    public void CheckCreatingNewUser(){
        PageNavigator pn = new PageNavigator(driver);
        RegisterPage onRegisterPage = pn.getHomePage().navigateToLogInPage().navigateToRegisterPage();
        onRegisterPage.FillRegisterWithValidData();
        Assert.assertTrue(onRegisterPage.verifyUserRegisteredSuccessfully().getText().contains("Vi har sendt deg en e-post!"));
    }

@Test
    public void getLoginLink() throws InterruptedException {
        driver.get("https://sysla.no/");
    WebElement myDynamicElement2 = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/div[4]/div/div[3]/div[2]/div[1]/a")));
    WebElement element = driver.findElement(By.xpath("/html/body/nav/div[4]/div/div[3]/div[2]/div[1]/a"));

    Actions actions = new Actions(driver);

    actions.moveToElement(element).click().perform();
        Thread.sleep(4000);

}

}
