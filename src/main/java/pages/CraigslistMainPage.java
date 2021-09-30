package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CraigslistMainPage {
    @FindBy(xpath = "//div[@id='jjj']//span[@class='txt' and contains(., 'jobs')]")
    WebElement JOBS_BUTTON;

    @FindBy(xpath = "//form[@id='searchform']//input[@id='query' and contains(., search)]")
    WebElement SEARCH_INPUT;

    public void switchToJobsCategory() {
        JOBS_BUTTON.click();
    }

    public void enterSearchText(String searchText) {
        SEARCH_INPUT.sendKeys(searchText);
        SEARCH_INPUT.submit();
    }
}
