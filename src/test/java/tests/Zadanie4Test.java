package tests;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Zadanie4Page;

public class Zadanie4Test extends TestConfig {

    @Test
    public void zadanie4Test()
    {
       WebDriver driver =  getDriver();
       String currentWindowName = driver.getWindowHandle();
       String name = "Jan Kowalski";
       String email = "Jan@o2.pl";
       String phone = "608-608-608";
       String succesSaveNotification = "Wiadomość została wysłana";

        // Url  bez buga
         getUrl("https://testingcup.pgs-soft.com/task_4");
        // Url z bugiem
        // getUrl("https://buggy-testingcup.pgs-soft.com/task_4");

        Zadanie4Page zadanie4 = new Zadanie4Page();

        zadanie4.aplikuj()
                .swutchToNewWindow(driver,currentWindowName)
                .switchFrame(driver)
                .fillForm(name,email,phone)
                .saveForm()
                .checkSaveNotification(succesSaveNotification);
    }
}
