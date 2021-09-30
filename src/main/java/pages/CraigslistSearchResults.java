package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CraigslistSearchResults {
    @FindBy(xpath = "//ul[@id='search-results']")
    WebElement RESULTS_LIST;

    @FindBy(xpath = "//div[@class='result-info']//*[contains(., 'Polish')]")
    WebElement OFFER_LINK;

    public void openOffer() {
        OFFER_LINK.click();
    }

}
