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
    @FindBy(xpath = "//div[@class='fancybox-toolbar compensate-for-scrollbar']/button[@title='Close']")
    public WebElement closePopUpButton;
    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    public WebElement buyButton;
    @FindBy(xpath = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']/div[@class='active-cart-item js_cart_count']")
    public WebElement cartCounterOfAddedItems;


    public int findListOfProductsSize() {

        return productsList.size();
    }

    public List<WebElement> findListOfProducts() {
        return productsList;
    }
    public void clickOnClosePopUpButton(){
        closePopUpButton.click();
    }
    public void clickOnBuyButton(){
        buyButton.click();
    }
    public String getCountOfAddedItems(){
        return cartCounterOfAddedItems.getText();
    }
}
