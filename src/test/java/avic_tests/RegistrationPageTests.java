package avic_tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationPageTests extends BaseTest{
    public static final String TELEPHONE_NUMBER = "0935487658";
    public static final String WRONG_TELEPHONE_NUMBER = "4550935487658";
    public static final String EMAIL = "dfdf@gmail.com";
    public static final String WRONG_EMAIL = "dfdfgmail.com";
    public static final String PASSWORD = "0935487658";
    public static final String CONFIRM_PASSWORD = "0935487658";

    @Test
    public void checkThatUserIsAbleToRegisterNewAccount(){
        getHomePage().clickOnUserAccountButton();
        getRegistrationPage().clickOnCreateNewAccountButton();
        getRegistrationPage().fillOutTelephoneNumberField(TELEPHONE_NUMBER);
        getRegistrationPage().fillOutEmailField(EMAIL);
        getRegistrationPage().fillOutPasswordField(PASSWORD);
        getRegistrationPage().fillOutConfirmPasswordField(CONFIRM_PASSWORD);
        getRegistrationPage().clickOnConfirmButton();
        Assert.assertTrue(getRegistrationPage().succesfullReagistrationPopUp.isDisplayed());
    }

    @Test
    public void checkErrorMesssageIfUserEnteredNotValidDataWhenRegisterNewAccountInPhoneField() {
        getHomePage().clickOnUserAccountButton();
        getRegistrationPage().clickOnCreateNewAccountButton();
        getRegistrationPage().fillOutTelephoneNumberField(WRONG_TELEPHONE_NUMBER);
        getRegistrationPage().fillOutEmailField(EMAIL);
        getRegistrationPage().fillOutPasswordField(PASSWORD);
        getRegistrationPage().fillOutConfirmPasswordField(CONFIRM_PASSWORD);
        getRegistrationPage().clickOnConfirmButton();
        Assert.assertEquals(getRegistrationPage().wrongTelephoneNumberError.getAttribute("data-error"), "Некорректный формат телефона");
    }
    @Test
    public void checkErrorMesssageIfUserEnteredNotValidDataWhenRegisterNewAccountInEmailField() {
        getHomePage().clickOnUserAccountButton();
        getRegistrationPage().clickOnCreateNewAccountButton();
        getRegistrationPage().fillOutTelephoneNumberField(TELEPHONE_NUMBER);
        getRegistrationPage().fillOutEmailField(WRONG_EMAIL);
        getRegistrationPage().fillOutPasswordField(PASSWORD);
        getRegistrationPage().fillOutConfirmPasswordField(CONFIRM_PASSWORD);
        getRegistrationPage().clickOnConfirmButton();
        Assert.assertEquals(getRegistrationPage().wrongEmailError.getAttribute("data-error"), "Некорректный email");
    }
}
