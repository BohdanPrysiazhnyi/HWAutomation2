package avic_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void setUpProfile() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public BasePage getBasePage(){
        return new BasePage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public IphonePage getIphonePage() {
        return new IphonePage(getDriver());
    }

    public AppleStorePage getAppleStorePage() {
        return new AppleStorePage(getDriver());
    }
    public RegistrationPage getRegistrationPage(){
        return new RegistrationPage(getDriver());
    }
}
