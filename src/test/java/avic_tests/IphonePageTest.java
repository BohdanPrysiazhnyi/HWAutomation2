package avic_tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IphonePageTest extends BaseTest {
    private static final String KEY_WORD = "iPhone";

    @Test
    public void checkThatProductsIsSortedByCategoryContainsIphones() {
        getHomePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnIphoneButton();
        getIphonePage().listOfIphones();
        for (WebElement webElement : getIphonePage().listOfIphones()) {
            Assert.assertTrue(webElement.getText().contains(KEY_WORD));
        }
    }
}
