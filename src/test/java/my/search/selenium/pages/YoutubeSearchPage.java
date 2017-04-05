package my.search.selenium.pages;

import core.Element;
import core.Elements;
import my.search.selenium.testconfigs.BaseTest;

import static core.ConciseAPI.*;
import static core.ElementConditions.text;

public class YoutubeSearchPage extends BaseTest {

    public static void visit() {
        open("http://youtube.com");
    }

    static Element searchField = $("#masthead-search-term");

    public static void search(String queryText) {
        searchField.setValue(queryText);
    }

    static Elements results = $$("#results .item-section>li");

    public static void assertResultsCount(int count) {
        results.shouldHaveSize(count);
    }

    public static void assertNthResult(int index, String text) {
        results.get(index).shouldHave(text(text));
    }

    public static void followLink(int index) {
        results.get(index).findInnerSelector(".yt-lockup-title").click();
    }

    public static void assertTitle(String title) {
        getDriver().getTitle().equals(title);
    }

}