package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static config.WebDriverSingledon.getInstance;

public class Zadanie9Page {

    public Zadanie9Page(){ PageFactory.initElements(getInstance(),this); }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/ul/li/i")
    private WebElement rootNodeFolder;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/ul/li/ul/li[2]/a/i")
    private WebElement childFolder;

    @FindBy(xpath = "/html/body/ul/li/a")
    private WebElement changeNameButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/ul/li/ul/li[2]/span/input")
    private WebElement newNameInput;

    @FindBy(xpath = "//*[@id='j1_4_anchor']")
    private WebElement folderNewName;

    public Zadanie9Page goToFolder()
    {
        rootNodeFolder.click();
        childFolder.click();
        return this;
    }


    public Zadanie9Page changeName(WebDriver driver)
    {
        Actions action = new Actions(driver);
        action.contextClick(childFolder).build().perform();
        return this;
    }

    public Zadanie9Page setNewName(String newFolderName)
    {
        changeNameButton.click();
        newNameInput.sendKeys(newFolderName);
        newNameInput.sendKeys(Keys.ENTER);
        return this;
    }

    public void checkNewName(String newFolderName)
    {
        Assert.assertEquals(folderNewName.getText(),newFolderName);
    }


}
