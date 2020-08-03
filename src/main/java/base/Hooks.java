package base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;

import java.io.IOException;

public class Hooks extends BaseTest{

    @Before
    public void beforeScenario(Scenario scenario) throws IOException
    {
        String scenarioName=scenario.getName();
        System.out.println("###### Now in Before Scenario #######");
        System.out.println("###### Scenario Started: " +scenarioName+ " #######");
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException
    {
        System.out.println("###### Now in After Scenario #######");
        System.out.println("###### Scenario End: " +scenario.getName()+ " #######");

        if(driver !=null)
        {
            driver.quit();
        }
    }


}
