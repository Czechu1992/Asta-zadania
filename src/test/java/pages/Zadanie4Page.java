package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Set;

import static config.WebDriverSingledon.getInstance;

public class Zadanie4Page {

    public Zadanie4Page() {
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/button")
    private WebElement aplikujButton;

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(id = "save-btn")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div/h1")
    private WebElement notificationText;


    public Zadanie4Page aplikuj()
        {
            aplikujButton.click();
            return this;
        }

    public Zadanie4Page fillForm(String name, String email, String phone)
    {
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        phoneInput.sendKeys(phone);
        return this;
    }

    public Zadanie4Page saveForm()
        {
            saveButton.click();
            return this;
        }

    public void checkSaveNotification(String succesNotification)
    {
        Assert.assertEquals(notificationText.getText(),succesNotification);
    }

    public Zadanie4Page switchFrame(WebDriver driver)
    {
        driver.switchTo().frame(0);
        return this;
    }


     public Zadanie4Page swutchToNewWindow(WebDriver driver, String currentWindowName)
     {
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilosć okien przegladarki: " + windows.size());
        for (String window : windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
         return this;
    }
}
