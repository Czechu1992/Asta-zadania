package config;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import static config.WebDriverSingledon.getInstance;
import static config.WebDriverSingledon.quit;

public class TestConfig {

    private WebDriver driver;


    @BeforeTest
    public void setUp()
    {
        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void getUrl(String Url)
    {
        driver.get(Url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void tearDown(){
        quit();
    }
}
