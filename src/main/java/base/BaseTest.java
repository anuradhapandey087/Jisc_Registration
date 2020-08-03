package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    //BaseClass for selenium
    public static void initialization()
    {
        String driverPath="src/main/resources/driver/chromedriver_v84.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.get("C:\\Users\\ANKIT\\eclipse-workspace\\Jisc_Registration\\src\\main\\resources\\registration-test\\index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

}
