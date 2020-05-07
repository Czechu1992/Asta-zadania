package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static config.WebDriverSingledon.getInstance;

public class Zadanie8Page {

    public Zadanie8Page() {
        PageFactory.initElements(getInstance(), this);
    }

    @FindBy(id = "task8_form_cardType")
    private WebElement selectCard;

    @FindBy(id = "task8_form_name")
    private WebElement nameInput;

    @FindBy(id = "task8_form_cardNumber")
    private WebElement cardNumberInput;

    @FindBy(id = "task8_form_cardCvv")
    private WebElement cardCvvInput;

    @FindBy(id = "task8_form_cardInfo_month")
    private WebElement mounthSelect;

    @FindBy(id = "task8_form_cardInfo_year")
    private WebElement yearSelect;

    @FindBy(name = "task8_form[save]")
    private WebElement saveFormButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div")
    private WebElement payNotification;



    public Zadanie8Page selectCard (String value)
    {
        Select Card = new Select(selectCard);
        Card.selectByValue(value);
        return this;
    }

    public Zadanie8Page fillForm(String name, String cardNumber, String cardCvv)
    {
        nameInput.sendKeys(name);
        cardNumberInput.sendKeys(cardNumber);
        cardCvvInput.sendKeys(cardCvv);
        return this;
    }

    public Zadanie8Page selectMounth(String value)
    {
        Select Mounth = new Select(mounthSelect);
        Mounth.selectByValue(value);
        return this;
    }

    public Zadanie8Page selectYear(String value)
    {
        Select Year = new Select(yearSelect);
        Year.selectByValue(value);
        return this;
    }

    public Zadanie8Page saveForm()
    {
        saveFormButton.click();
        return this;
    }

    public void checNotification(String succesPayNotification)
    {
        Assert.assertEquals(payNotification.getText(),succesPayNotification);
    }
}
