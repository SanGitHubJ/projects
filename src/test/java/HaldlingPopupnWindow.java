import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HaldlingPopupnWindow {

    public WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("http://popuptest.com/goodpopups.html"); //For Test =1

     //   driver.get("https://html.com/input-type-file/"); // for test =2

       // driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); for test=3

        driver.get("https://www.google.com/");

    }

    @Test
    public void capturePopup() throws InterruptedException {

        driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();

        Set<String> handler = driver.getWindowHandles();

        Iterator<String> it = handler.iterator();

        String parentid = it.next();

        System.out.println("Paranet id------>"+parentid);

        String childid = it.next();

        System.out.println("Child >>>"+childid);

        driver.switchTo().window(childid);

        System.out.println("Child "+ driver.getTitle());

        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(parentid);

        System.out.println("Child "+ driver.getTitle());

        Thread.sleep(2000);


    }

//    @Test
//    public void testFileUpload(){
//
//        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/home/sanath/Pictures/Screenshot from 2018-05-29 23-21-20.png");
//
//        driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.MILLISECONDS);
//    }
//
//    @Test
//    public void validatePopupMsg() throws InterruptedException {
//
//
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        Alert alert = driver.switchTo().alert();
//
//        System.out.println(alert.getText());
//
//        Thread.sleep(3000);
//
//        alert.accept();
//
//    }

//    @Test
//    public void getDynamicObject() throws InterruptedException {
//
//
//        Actions action = new Actions(driver);
//
//        action.moveToElement(driver.findElement(By.xpath("//div[@class='gb_md']"))).build().perform();
//
//        driver.findElement(By.xpath("//a[@class='gb_Ba gb_Cd gb_ld']")).click();
//
//        Thread.sleep(3000);
//
//
//        driver.findElement(By.id("lst-ib")).sendKeys("Testing");
//
//        List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));
//
//        System.out.println("Google search list lise is ====>"+list.size());
//    }


    @AfterMethod
    public void tearDown(){

        //driver.close();
    }
}