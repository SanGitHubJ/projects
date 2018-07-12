package PickUpCalender;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StaticCalenderPick {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        driver.get("https://www.redbus.in/");

       // Actions actions = new Actions(driver);
       // actions.moveToElement(driver.findElement()).build().perform();
        Thread.sleep(15000);
//        Alert alert = driver.switchTo().alert();
  //      System.out.println(alert.getText());
    //    alert.accept();

        driver.findElement(By.xpath("//div[@id='search_div']//section//div//div//input[@type='text' and @id='onward_cal']")).click();


    }
    }
