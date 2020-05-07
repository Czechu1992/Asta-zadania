package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static config.WebDriverSingledon.getInstance;

public class Zadanie7Page {

    public Zadanie7Page() {
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div/input")
    private WebElement okularyInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div[1]/img")
    private WebElement okularyDrag;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]")
    private WebElement dropZone;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/span")
    private WebElement okularySummary;

    public Zadanie7Page addOkulary(String okularyQuantity)
    {
        okularyInput.clear();
        okularyInput.sendKeys(okularyQuantity);
        return this;
    }

    public Zadanie7Page dragAndDrop(WebDriver driver)
    {
        Actions action = new Actions(driver);
        action.dragAndDrop(okularyDrag,dropZone).build().perform();
        return this;
    }

    public void checkOkularySummary(String okularyQuantity)
    {
        Assert.assertEquals(okularySummary.getText(),okularyQuantity);
    }

}
