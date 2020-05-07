package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static config.WaitForVisibility.waitForVisibilityOfElement;
import static config.WebDriverSingledon.getInstance;

public class Zadanie5Page {

    public Zadanie5Page() {
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div[2]/span/input")
    private WebElement fileInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/table/tbody/tr[10]/td[1]")
    private WebElement nameofTenthPerson;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div/table/tbody/tr[11]/td[1]")
    private WebElement nameOfEleventhPerson;

    public Zadanie5Page sendFile(String filePatch)
    {
        fileInput.sendKeys(filePatch);
        return this;
    }

    public void checkPersonName(String tenthPerson, String eleventhPerson)
    {
        waitForVisibilityOfElement(nameofTenthPerson);
        Assert.assertEquals(nameofTenthPerson.getText(),tenthPerson);
        Assert.assertEquals(nameOfEleventhPerson.getText(),eleventhPerson);
    }

}
