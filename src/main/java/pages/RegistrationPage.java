package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='btn-offers']")
    public WebElement createNewAccountButton;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement telephoneNumberInputField;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;
    @FindBy(xpath = "//input[@class='validate password_1 show-password']")
    public WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@class='button-reset main-btn js_validate submit main-btn--green']")
    public WebElement confirmButton;
    @FindBy(xpath = "//div[@id='modalAlert']")
    public WebElement succesfullReagistrationPopUp;
    @FindBy(xpath = "//div[@data-error='Некорректный формат телефона']")
    public WebElement wrongTelephoneNumberError;
    @FindBy(xpath = "//div[@data-error='Некорректный email']")
    public WebElement wrongEmailError;

    public void clickOnConfirmButton(){
        confirmButton.click();
    }

    public void fillOutConfirmPasswordField(String str) {
        confirmPasswordField.sendKeys(str);
    }

    public void fillOutPasswordField(String str) {
        passwordField.sendKeys(str);
    }

    public void fillOutEmailField(String str) {
        emailInputField.sendKeys(str);
    }

    public void fillOutTelephoneNumberField(String str) {
        telephoneNumberInputField.sendKeys(str);
    }

    public void clickOnCreateNewAccountButton() {
        createNewAccountButton.click();
    }

}
