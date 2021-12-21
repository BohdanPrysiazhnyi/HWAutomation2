package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    //private final static String SEARCH_INPUT = "//input[@id='input_search']";
    // private final static String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String searchWord) {
        searchInput.sendKeys(searchWord);
        searchButton.click();
    }
}
