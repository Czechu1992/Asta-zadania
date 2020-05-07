package tests;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Zadanie3Page;

public class Zadanie3Test extends TestConfig {


    @Test
    public void zadanie2Test()
    {
        WebDriver driver = getDriver();
        String successSaveNotification = "Twoje dane zostały poprawnie zapisane";

        // Url bez buga
        getUrl("https://testingcup.pgs-soft.com/task_3");

        // Url z bugiem
        //getUrl("https://buggy-testingcup.pgs-soft.com/task_3");

        Zadanie3Page zadanie3 = new Zadanie3Page();

        zadanie3.openForm(driver)
                .fillForm()
                .checkSaveNotification(successSaveNotification);
    }
}
