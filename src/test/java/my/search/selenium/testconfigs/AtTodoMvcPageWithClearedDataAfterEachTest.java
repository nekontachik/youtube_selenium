package my.search.selenium.testconfigs;


import org.junit.After;

import static core.ConciseAPI.executeJavascript;

public class AtTodoMvcPageWithClearedDataAfterEachTest extends BaseTest {

//    @Before
//    public void openPage() {
//        open("https://gmail.com/ncr");
//    }

    @After
    public void clearData() {
        executeJavascript("localStorage.clear()");
    }
}
