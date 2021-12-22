package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    Actions action = new Actions(driver);

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;
    @FindBy(xpath = "//span[@class='sidebar-item-title']/img[@alt='Apple Store']")
    public WebElement appleStoreButton;
    @FindBy(xpath = "//span[@class='sidebar-item']")
    public WebElement buttonProdactCatalog;
    @FindBy(xpath = "//div[@class='header-bottom__logo']")
    public WebElement headerLogo;
    @FindBy(xpath = "//div[@class='menu-lvl first-level']")
    public WebElement menuOfCategories;
    @FindBy(xpath = "//div[@class='header-bottom__right-icon']/i[@class='icon icon-cart-new']")
    public WebElement productCartButton;
    @FindBy(xpath = "//div[@class='header-bottom__right-icon']/i[@class='icon icon-user-big']")
    public WebElement userAccountButton;
    @FindBy(xpath = "//li[@class='has-dropdown']")
    public WebElement langDropDown;
    @FindBy(xpath = "//a[@href='https://avic.ua/ua']")
    public WebElement uaLanguageInDropDownList;

    public void clickOnUaLanguageInDropDownList(){
        uaLanguageInDropDownList.click();
    }

    public void searchByKeyword(final String searchWord) {
        searchInput.sendKeys(searchWord);
        searchButton.click();
    }

    public void clickOnAppleStoreButton() {
        appleStoreButton.click();
    }
    public void clickOnUserAccountButton(){
        userAccountButton.click();
    }
    public void hoverOnLangDropDownList(){
        action.moveToElement(langDropDown).build().perform();
    }
}
