package page;

import base.BaseTest;
import jdk.jfr.events.ExceptionThrownEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BaseTest {

    private static String registrationButton="//*[@class='btn btn-primary btn-lg']";
    private static String name="//*[@id='name']";
    private static String email="//*[@id='email']";
    private static String webAdd="//*[@id='url']";
    private static String interests="//*[@placeholder='Tell us about your sectors of interest']";
    private static String password="//*[@id='password']";
    private static String confirmPassword="//*[@id='confirmPassword']";



    public void navigateRegistrationPage() throws Exception
     {
         try
         {
             WebElement regBtn = driver.findElement(By.xpath(registrationButton));
             regBtn.click();
             Thread.sleep(3000);
             System.out.println("User has been navigate to Registration Page");

         }
         catch(Exception e)
         {
            e.printStackTrace();
         }

     }

     public void enterRegistrationDetails() throws Exception
     {
         try
         {
            driver.findElement(By.xpath(name)).sendKeys("Anuradha");
            driver.findElement(By.xpath(email)).sendKeys("anuradha@gmail.com");
            driver.findElement(By.xpath(webAdd)).sendKeys("https://www.myntra.com");
            Thread.sleep(3000);
            driver.findElement(By.xpath(interests)).sendKeys("Shopping, Internet Surfing, Reading, Travelling");
             System.out.println("Bajpai");
             driver.findElement(By.xpath(password)).sendKeys("Digital@123");
             driver.findElement(By.xpath(confirmPassword)).sendKeys("Digital@123");
             System.out.println("Anuj");

         }
         catch (Exception e)
         {

         }
     }




}
