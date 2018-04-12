package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TNav {

WebDriver driver;
WebDriverWait wait;
    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
