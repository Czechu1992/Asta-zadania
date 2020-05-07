package tests;


import config.TestConfig;
import org.testng.annotations.Test;
import pages.Zadanie1Page;

public class Zadanie1Test extends TestConfig {

    @Test
    public void testZadanie1() {

        String okulary = "5";
        String pilka = "3";
        String kubek = "4";

        // Url bez Buga
         getUrl("https://testingcup.pgs-soft.com/task_1");
        // Url Z Bugiem
        // getUrl("https://buggy-testingcup.pgs-soft.com/task_1");


        Zadanie1Page zadanie1 = new Zadanie1Page();

        zadanie1.addOkularyToCart(okulary)
                .addPilkaToCart(pilka)
                .addKubekToCart(kubek)
                .checkOkularySummary(okulary)
                .checkPilkaSummary(pilka)
                .checkKubekSummary(kubek);
    }
}
