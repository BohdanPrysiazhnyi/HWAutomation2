package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void checkThatUserIsAbleToChangeLanguage(){
        getHomePage().hoverOnLangDropDownList();
        getHomePage().clickOnUaLanguageInDropDownList();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("ua/ua"));
    }


    @Test
    public void heckThatMainPageContainsAllRequiredElements(){
        Assert.assertTrue(getHomePage().appleStoreButton.isDisplayed());
        Assert.assertTrue(getHomePage().buttonProdactCatalog.isDisplayed());
        Assert.assertTrue(getHomePage().headerLogo.isDisplayed());
        Assert.assertTrue(getHomePage().menuOfCategories.isDisplayed());
        Assert.assertTrue(getHomePage().appleStoreButton.isDisplayed());
        Assert.assertTrue(getHomePage().userAccountButton.isDisplayed());
        Assert.assertTrue(getHomePage().productCartButton.isDisplayed());
    }
}
