import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicHandleObjects {

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
    public void getDynamicObject() throws InterruptedException {

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//div[@class='gb_md']"))).build().perform();

        driver.findElement(By.xpath("//a[@class='gb_Ba gb_Cd gb_ld']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Java");

       List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));

        System.out.println("Google search list lise is ====>"+list.size());

        Thread.sleep(3000);

        for(int i=0; i<list.size();i++){

            System.out.println(" Java serach result is ==>>"+list.get(i).getText());

            if(list.get(i).getText().contains("javascript")){
                list.get(i).click();
                break;
            }

;        }
    }

    @AfterMethod
    public void tearDown(){

       driver.quit();
    }

}
