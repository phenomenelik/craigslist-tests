import org.junit.Test;


public class TestSearch extends TestManager{


    @Test
    public void SearchForAJob(){
        mainPage.switchToJobsCategory();
        mainPage.enterSearchText("tutor");
        searchResultsPage.openOffer();
        offerPage.addToFavorites();
    }
}
