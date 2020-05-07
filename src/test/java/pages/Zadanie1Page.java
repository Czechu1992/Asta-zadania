package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static config.WebDriverSingledon.getInstance;

public class Zadanie1Page {

    public Zadanie1Page(){PageFactory.initElements(getInstance(),this); }

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div/input")
    private WebElement okularyInput;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div/span")
    private WebElement okularyAdd;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div/input")
    private WebElement pilkaInput;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div/span")
    private WebElement pilkaAdd;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[3]/div/div/div/input")
    private WebElement kubekInput;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[3]/div/div/div/span")
    private WebElement kubekAdd;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/span")
    private WebElement okularySummary;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/span")
    private WebElement pilkaSummary;

    @FindBy (xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[1]/div[3]/div[1]/span")
    private WebElement kubekSummary;


    public Zadanie1Page addOkularyToCart (String quantity)
    {
        okularyInput.clear();
        okularyInput.sendKeys(quantity);
        okularyAdd.click();
        return this;
    }
    public Zadanie1Page addPilkaToCart (String quantity)
    {
        pilkaInput.clear();
        pilkaInput.sendKeys(quantity);
        pilkaAdd.click();
        return this;
    }

    public Zadanie1Page addKubekToCart (String quantity)
    {
        kubekInput.clear();
        kubekInput.sendKeys(quantity);
        kubekAdd.click();
        return this;
    }

    public Zadanie1Page checkOkularySummary(String quantity)
    {
        Assert.assertEquals(okularySummary.getText(),quantity);
        return this;
    }

    public Zadanie1Page checkPilkaSummary(String quantity)
    {
        Assert.assertEquals(pilkaSummary.getText(),quantity);
        return this;
    }

    public void checkKubekSummary(String quantity)
    {
        Assert.assertEquals(kubekSummary.getText(),quantity);
    }
}
