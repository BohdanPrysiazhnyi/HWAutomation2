package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    private static final String PRODUCT_ICON = "//div[@class='prod-cart height']";


    public int findListOfProductsSize() {
        List<WebElement> webElementList = driver.findElements(By.xpath(PRODUCT_ICON));
        return webElementList.size();
    }

    public List<WebElement> findListOfProducts() {
        return driver.findElements(By.xpath(PRODUCT_ICON));
    }
}
