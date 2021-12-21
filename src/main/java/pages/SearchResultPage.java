package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='prod-cart height']")
    public List<WebElement> productsList;


    public int findListOfProductsSize() {

        return productsList.size();
    }

    public List<WebElement> findListOfProducts() {
        return productsList;
    }
}
