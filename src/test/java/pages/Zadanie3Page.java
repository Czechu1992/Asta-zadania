package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static config.WebDriverSingledon.getInstance;
import static config.WaitForVisibility.waitForVisibilityOfElement;

public class Zadanie3Page {

    public Zadanie3Page(){ PageFactory.initElements(getInstance(),this); }

    @FindBy(xpath = "/html/body/div/div/div[2]/ul/li/a")
    private WebElement menuButton;

    @FindBy(xpath = "//*[@id='menu1']/li[1]/a")
    private WebElement formButton;

    @FindBy(xpath = "//*[@id='start-edit']")
    private WebElement editButton;

    @FindBy(id = "in-name")
    private WebElement nameInput;

    @FindBy(id = "in-surname")
    private WebElement surnameInput;

    @FindBy(id = "in-notes")
    private WebElement noteInput;

    @FindBy(id = "in-phone")
    private WebElement phoneInput;

    @FindBy(id = "save-btn")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/span")
    private WebElement saveNotification;

    public Zadanie3Page openForm(WebDriver driver)
    {
        Actions action = new Actions(driver);
        action.moveToElement(menuButton).build().perform();
        action.moveToElement(formButton).build().perform();
        action.moveToElement(editButton).click().build().perform();
        return this;
    }

    public Zadanie3Page fillForm()
    {
        nameInput.clear();
        nameInput.sendKeys("Jan");
        surnameInput.clear();
        surnameInput.sendKeys("Kowalski");
        noteInput.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        phoneInput.clear();
        phoneInput.sendKeys("777888999");
        saveButton.click();
        return this;
    }

    public void checkSaveNotification(String notification)
    {
        waitForVisibilityOfElement(saveNotification);
        Assert.assertEquals(saveNotification.getText(),notification);
    }
}
