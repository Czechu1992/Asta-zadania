package tests;

import config.TestConfig;
import org.testng.annotations.Test;
import pages.Zadanie8Page;

public class Zadanie8Test extends TestConfig {

    @Test
    public void zadanie8Test(){

        String name = "Jan Kowalski";
        String cardNumber = "4222222222222";
        String cardCvv = "997";
        String selectCardValue = "vs";
        String selectMounthValue = "06";
        String selectYearValue = "2021";
        String succesPayNotification = "Zamówienie opłacone";

        // Url bez buga
        getUrl("https://testingcup.pgs-soft.com/task_8");

        // Url z bugiem
        //getUrl("https://buggy-testingcup.pgs-soft.com/task_8");

        Zadanie8Page zadanie8 = new Zadanie8Page();

        zadanie8.selectCard(selectCardValue)
                .fillForm(name,cardNumber,cardCvv)
                .selectMounth(selectMounthValue)
                .selectYear(selectYearValue)
                .saveForm()
                .checNotification(succesPayNotification);
    }
}
