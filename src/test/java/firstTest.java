import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sanath on 5/6/2018.
 */
public class firstTest {
    public WebDriver driver;


    @BeforeTest
    public void browserInvoke(){
        String driverlocation="E:\\Sanath\\Sellenium sw\\projects\\drivers\\chromedriver.exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void toolsQA() throws InterruptedException {
       driver.get("http://store.demoqa.com/");
        driver.findElement(By.linkText("Product Category")).click();

        Thread.sleep(5000);

        boolean iphone=driver.findElement(By.linkText("iPhone 5")).isDisplayed();

       // System.out.println(iphone);
        Assert.assertEquals(iphone,true);
        driver.findElement(By.cssSelector("[type='text']"));
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("mouse") ;
        driver.findElement(By.name("s")).sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        boolean result=driver.findElement(By.linkText("Magic Mouse")).isDisplayed();
        Assert.assertEquals(result,true);


    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
