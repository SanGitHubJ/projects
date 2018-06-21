package DragnDrop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BackFrontMoveBrowser {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        driver.get("http://jqueryui.com/droppable/");

        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();

        driver.navigate().refresh();

    }
}
