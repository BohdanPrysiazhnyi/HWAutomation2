package avic_tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultTests extends BaseTest {

    private static final String KEY_WORD = "iPhone 13";
    private static final String EXPECTED_QUERY = "query=iPhone";
    private static final int PRODUCTS_QUANTITY = 12;


    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(KEY_WORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }

    @Test
    public void checkThatSearchResultPageContainsListOfResultsWithRightSize() {
        getHomePage().searchByKeyword(KEY_WORD);
        Assert.assertEquals(getSearchResultPage().findListOfProductsSize(), PRODUCTS_QUANTITY);
    }

    @Test
    public void checkThatSearchResultListContainsIphones() {
        getHomePage().searchByKeyword(KEY_WORD);
        for (WebElement webElement : getSearchResultPage().findListOfProducts()) {
            Assert.assertTrue(webElement.getText().contains(KEY_WORD));
        }
    }
}
