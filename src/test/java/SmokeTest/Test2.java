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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PageNavigator;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.Is.is;

@Epic("Smoke tests")
@Feature("My First Tests scenarious")
public class Test2 extends TNav {



    @Test(description = "Check that home Page is opened")
    //@Step()
    public void getHomePage(){
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.getHomePage();
        //Assert.assertTrue(driver.getTitle().contains("Sysla - SYSLA"));
      // assertThat(driver.findElement(By.xpath("/html/body/nav/div[59]/div/div[3]/div[1]/a")).getText(), is("bli abonnent"));
        assertThat(onHomePage.checkHomePageOpened(), is("Sysla - SYSLA"));
        //check here, when test fails , in report this step is not marked as fail;
    }




}
