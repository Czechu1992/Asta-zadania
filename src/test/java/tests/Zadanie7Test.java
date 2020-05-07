package tests;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Zadanie7Page;

public class Zadanie7Test extends TestConfig {

    @Test
    public void zadanie7Test()
    {
        WebDriver driver = getDriver();
        String okularyQuantity = "3";

        // Url bez buga
        getUrl("https://testingcup.pgs-soft.com/task_7");
        // Url z bugiem
        //getUrl("https://buggy-testingcup.pgs-soft.com/task_7");

        Zadanie7Page zadanie7 = new Zadanie7Page();

        zadanie7.addOkulary(okularyQuantity)
                 .dragAndDrop(driver)
                 .checkOkularySummary(okularyQuantity);
    }
}
