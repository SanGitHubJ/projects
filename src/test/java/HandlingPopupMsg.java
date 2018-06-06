import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class HandlingPopupMsg {

    public WebDriver driver;

    @BeforeMethod
    public void openBrowser() {

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//        driver.get("https://mail.rediff.com");

    }

    @Test
    public void validatePopupMsg() throws InterruptedException {


           driver.findElement(By.xpath("//input[@type='submit']")).click();
            Alert alert = driver.switchTo().alert();

            System.out.println(alert.getText());

                Thread.sleep(3000);

            alert.accept();

    }

    @AfterMethod
    public void tearDown(){

            driver.quit();
    }
}
