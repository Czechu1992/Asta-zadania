package tests;


import config.TestConfig;
import org.testng.annotations.Test;
import pages.Zadanie5Page;

public class Zadanie5Test extends TestConfig {

    @Test
    public void zadanie5Test()
        {
            String filePatch = "C:\\Users\\czech\\Desktop\\AstaZadaniaPageObject\\src\\main\\resources\\TextDowyslania.txt";
            String tenthPerson = "Anna";
            String eleventhPerson = "Kasia";

            // Url bez buga
            getUrl("https://testingcup.pgs-soft.com/task_5");
            // Url z bugiem
            //getUrl("https://buggy-testingcup.pgs-soft.com/task_5");

            Zadanie5Page zadanie5 = new Zadanie5Page();

            zadanie5.sendFile(filePatch)
                    .checkPersonName(tenthPerson,eleventhPerson);
        }

}
