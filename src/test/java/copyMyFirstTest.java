import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.ExcelUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sanath on 5/9/2018.
 */
public class copyMyFirstTest {

    public WebDriver driver;


    @BeforeTest

    public void invokeBrowser(){

        String driverlocation="E:\\Sanath\\Sellenium sw\\projects\\drivers\\chromedriver(1).exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



    }

    @Test

    public void testHome() throws Exception {

        String path = "E://Sanath//Sellenium sw//projects//DataEngine.xlsx";
        String sheet = "TestData";

        ExcelUtils.setExcelFile(path,sheet);
        String Name = ExcelUtils.getCellData(1,0);
        String pw = ExcelUtils.getCellData(1,1);
        driver.get("http://store.demoqa.com/");

       /* //to capture()css elemenat
        driver.findElement(By.cssSelector("div[id='account']>a")).click();

        // Thread.sleep(5000);
        driver.findElement(By.id("log")).sendKeys(Name);
        driver.findElement(By.id("pwd")).sendKeys(pw);
        driver.findElement(By.id("login")).click(); */
        copyReusableClass.login(driver,Name,pw);

        Thread.sleep((5000));

        driver.manage().deleteAllCookies();
        //to capture the mouse mover elements
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.linkText("Product Category"))).build().perform();
        //End mover capture
        //driver.findElement(By.linkText("Product Category")).click();
        driver.findElement(By.linkText("MacBooks")).click();

        Thread.sleep((5000));

        boolean macbook = driver.findElement(By.cssSelector(".product_view_103 .wpsc_product_title")).isDisplayed();
        Assert.assertEquals(macbook,true);

        driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/product-category/macbooks/apple-13-inch-macbook-pro/']/../../form/div[2]/div/span/input")).click();
        Thread.sleep((5000));
        driver.findElement(By.cssSelector("#header_cart .icon")).click();
        Thread.sleep((5000));
        String prdt = driver.findElement(By.cssSelector("td[class='wpsc_product_name wpsc_product_name_0']>a")).getText();
        Assert.assertEquals(prdt,"Apple 13-inch MacBook Pro");

        String qnty = driver.findElement(By.cssSelector(".wpsc_product_quantity_0 [type='text']")).getAttribute("value");
        /*if equals(qnty=1){
            Assert.assertEquals(qnty,true);
            else
                Assert.assertEquals(qnty,false);

        }*/
        System.out.println(qnty);
        Assert.assertEquals(qnty,qnty);
    }

    @AfterTest

    public void closeBrowser(){

        driver.close();
        driver.quit();

    }
}
