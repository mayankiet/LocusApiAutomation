package baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;


public class TestBase {

    protected ConfigReader configReader;

    @BeforeMethod
    public void startTest(){

    }

    @AfterMethod
    public void endTest(){

    }
}
