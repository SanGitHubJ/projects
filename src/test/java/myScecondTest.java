import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sanath on 5/7/2018.
 */
public class myScecondTest {

    public WebDriver driver;
    @BeforeTest

    public void lunchBrowser(){


        String driverlocation="E:\\Sanath\\Sellenium sw\\projects\\drivers\\chromedriver(1).exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



    }

    @Test

    public void testButtons() throws InterruptedException {

        driver.get("http://toolsqa.com/automation-practice-form/");

        Thread.sleep(2000);

       driver.findElement(By.cssSelector("div[class='control-group']>input[name='firstname']")).sendKeys("sana");

        driver.findElement(By.cssSelector("div[class='control-group']>input[id='sex-0']")).click();

        driver.findElement(By.cssSelector("div[class='control-group']>input[id='profession-0']")).click();

        //WebElement Dvalue = driver.findElement(By.cssSelector("div[class='controls']>select[id='continents']"));
        Select newvalue = new Select
                (driver.findElement(By.cssSelector("div[class='controls']>select[id='continents']")));

        newvalue.selectByVisibleText("Asia");
        Thread.sleep(5000);
        System.out.print(newvalue);
        Thread.sleep(1000);
    }

    @AfterTest

    public void closeBrower(){

        driver.close();
        driver.quit();
    }
}
