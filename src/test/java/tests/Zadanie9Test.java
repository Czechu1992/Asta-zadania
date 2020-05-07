package tests;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Zadanie9Page;

public class Zadanie9Test extends TestConfig {

    @Test
    public void zadanie9Test()
    {
        WebDriver driver = getDriver();
        String newFolderName = "newName";

        // Url bez buga
           getUrl("https://testingcup.pgs-soft.com/task_9");
        // Url z bugiem
        // getUrl("https://buggy-testingcup.pgs-soft.com/task_9");


        Zadanie9Page zadanie9 = new Zadanie9Page();

        zadanie9.goToFolder()
                .changeName(driver)
                .setNewName(newFolderName)
                .checkNewName(newFolderName);
    }
}
