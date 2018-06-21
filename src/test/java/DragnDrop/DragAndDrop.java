package DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {

     public static WebDriver driver;


    public static void main(String[] args) {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        driver.get("http://jqueryui.com/droppable/");

        driver.switchTo().frame(0); // or can pass frame(0) or frame("iframe")

        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(By.xpath("//*/body[1]/div[1]")))
                .moveToElement(driver.findElement(By.xpath("//*/body[1]/div[2]")))
                .release().build().perform();
    }
}
