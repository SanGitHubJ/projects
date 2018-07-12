package FindCordinates;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FindCordinates {

    public WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("https://www.google.com/");

        Thread.sleep(5000);

    }

    @Test
    public void getCordinates() throws InterruptedException {

        Point loct = driver.findElement(By.id("lst-ib")).getLocation();

        boolean isenable= driver.findElement(By.id("lst-ib")).isEnabled();

        if (isenable==true)
        System.out.println("is enable");


        //driver.findElement(By.id("lst-ib")).getCssValue()

       //  Rectangle sz = driver.findElement(By.id("lst-ib")).getRect();
        //System.out.println("getreact"+sz);
        System.out.println("getsize"+driver.findElement(By.id("lst-ib")).getSize());
        System.out.println("gettagname"+driver.findElement(By.id("lst-ib")).getTagName());

        System.out.println(loct.x);
        System.out.println(loct.y);

        driver.findElement(By.id("lst-ib")).sendKeys("test");

        driver.findElement(By.id("lst-ib")).sendKeys(Keys.HELP);

        Thread.sleep(2000);

        driver.findElement(By.id("lst-ib")).sendKeys("tabtest");

        Thread.sleep(2000);

        //driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);

        System.out.println(driver.findElement(By.id("lst-ib")).getAttribute("value"));




    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
