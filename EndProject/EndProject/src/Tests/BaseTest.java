package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "/Users/darkostojicic/Desktop/EndProject/EndProject/lib/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        // System.setProperty("webdriver.gecko.driver", "/Users/darkostojicic/Desktop/EndProject/EndProject/lib/geckodriver 2");
        // driver = new FirefoxDriver();
        // driver.manage().window().maximize();
        // FirefoxOptions options = new FirefoxOptions();
        // options.setHeadless(true);
        // driver = new FirefoxDriver(options);
    }
    @After
    public void teardown(){
        driver.quit();
    }
    
}
