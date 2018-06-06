package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sanath on 5/25/2018.
 */
public class SelectCalenderDate {

    public WebDriver driver;
    public void openBrowser(){

        String driverlocation="E:\\Sanath\\SelleniumNew\\projects\\drivers\\chromedriver(1).exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.gecko.driver",driverPath.toString());
        driver= new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("https://www.skyscanner.com.sg/?");

    }

    @Test
    public void testCase() throws Exception {


    }

    }



