package my.search.selenium;

import my.search.selenium.pages.YoutubeSearchPage;
import my.search.selenium.testconfigs.BaseTest;
import org.junit.Test;

public class YoutubeSearchTest extends BaseTest {

    @Test
    public void searchAndFollowLink() {

        YoutubeSearchPage.visit();
        YoutubeSearchPage.search("selenide");

        YoutubeSearchPage.assertResultsCount(20);

        YoutubeSearchPage.assertNthResult(1, "Selenide: лаконичные и стабильные UI тесты на Java");

        YoutubeSearchPage.followLink(1);

        YoutubeSearchPage.assertTitle("Selenide: лакон8ичные и стабильные UI тесты на Java");
    }


}


