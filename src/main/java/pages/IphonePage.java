package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IphonePage extends BasePage {
    public IphonePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='prod-cart height']")
    public List<WebElement> listOfIphones;


    public List<WebElement> listOfIphones(){
        return listOfIphones;
    }
}
