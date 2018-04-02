package SmokeTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageNavigator;

public class Test2 extends TNav {

    @Test
    public void getHomePage(){
        PageNavigator pn = new PageNavigator(driver);
        pn.getHomePage();
        Assert.assertTrue(driver.getTitle().contains("Sysla - SYSLA"));
    }

}
