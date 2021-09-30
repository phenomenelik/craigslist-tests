import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CraigslistMainPage;
import pages.CraigslistOfferPage;
import pages.CraigslistSearchResults;

public class TestManager {
    WebDriver driver;
    CraigslistMainPage mainPage;
    CraigslistSearchResults searchResultsPage;
    CraigslistOfferPage offerPage;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = PageFactory.initElements(driver, CraigslistMainPage.class); //tu też spytać Sassyego
        searchResultsPage = PageFactory.initElements(driver, CraigslistSearchResults.class);
        offerPage = PageFactory.initElements(driver, CraigslistOfferPage.class);
        driver.get("https://warsaw.craigslist.org/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
