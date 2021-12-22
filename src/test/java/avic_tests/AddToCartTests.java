package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTest{
    private static final String KEY_WORD = "iPhone 13";
    private static final String COUNT_ADDED_PRODUTS = "1";

    @Test
    public void checkCountOfProductsAddedToProductCart(){
        getHomePage().searchByKeyword(KEY_WORD);
        getSearchResultPage().clickOnBuyButton();
        getBasePage().implicitiWait(10);
        //getSearchResultPage().clickOnClosePopUpButton();
        getDriver().navigate().refresh();
        Assert.assertEquals(getSearchResultPage().getCountOfAddedItems(), COUNT_ADDED_PRODUTS);
    }
}
