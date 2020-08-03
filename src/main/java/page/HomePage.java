package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class HomePage extends BaseTest {

    private static String registrationButton="//*[@class='btn btn-primary btn-lg']";
    private static String RegistrationText= "//*[@class='jumbotron']/h1";

    public void verifyRegistrationBtn() throws Exception
    {
        try
        {
            WebElement regBtn = driver.findElement(By.xpath(registrationButton));
            regBtn.isDisplayed();
            Thread.sleep(4000);
            System.out.println("Registration Button has displayed");

        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Registration Button did not displayed");
        }
    }

    public void verifyRegistrationText() throws Exception
    {
        try
        {
            WebElement RegText=driver.findElement(By.xpath(RegistrationText));
            String Text=RegText.getText();
            System.out.println("Main Text is " +Text);
            Assert.assertEquals("Registration Text Showing as expected", Text,"Registration Test");
            System.out.println("Registration Test text has displayed");

        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Registration Test text did not displayed");
        }
    }

}
