import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by viswankb on 7/28/14.
 */
public class OpenGoogle {

    //Creating object for webdriver
    WebDriver driver;

    //All steps will be performed before test method
    @BeforeMethod
    public void setup(){

        driver = new FirefoxDriver();
        driver.get("http://google.com");
    }

    //All steps will be performed after test method
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    //Actions to be performed as per test case
    @Test
    public void test(){
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void test2(){
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
