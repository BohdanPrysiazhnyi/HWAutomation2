package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AppleStorePage extends BasePage {
    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='brand-box__info']/div[@class='brand-box__title']/a[contains(text(),'iPhone')]")
    public WebElement iphoneIcon;





    public void clickOnIphoneButton(){
        iphoneIcon.click();
    }


}
