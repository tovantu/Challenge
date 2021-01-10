package TestSupport;

import PageObject.PageBase;
import org.junit.After;
import org.junit.Before;

public class TestBase {
    public PageBase Page = null;
    public final String URL = "https://feature-qa.customer-frontend.staging.aspireapp.com/sg/login";

    @Before
    public void setUp(){
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().get(URL);
        Page = new PageBase();
    }

    @After
    public void cleanUp(){
        DriverManager.resetDriver();
    }
}
