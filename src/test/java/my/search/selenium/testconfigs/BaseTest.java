package my.search.selenium.testconfigs;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

import static core.ConciseAPI.getDriver;
import static core.ConciseAPI.setDriver;

public class BaseTest {

    @BeforeClass
    public static void WebDriver() {
        setDriver(new FirefoxDriver());
    }

    @AfterClass
    public static void closeBrowser() {
        getDriver().quit();
    }
}


