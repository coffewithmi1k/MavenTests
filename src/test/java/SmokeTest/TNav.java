package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TNav {

WebDriver driver;
    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
