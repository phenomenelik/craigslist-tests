package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CraigslistOfferPage {
    @FindBy(xpath = "//section[@class='userbody']")
    WebElement OFFER;

    @FindBy(xpath = "//div[@class='fave']")
    WebElement FAVORITE_BUTTON;

    public void addToFavorites() {
        FAVORITE_BUTTON.click();
    }
}
