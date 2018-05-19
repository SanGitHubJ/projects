import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sanath on 5/13/2018.
 */

public class dynamicWebTableHandle {

        public WebDriver driver;

    @BeforeTest

    public void invokeBrowser2(){

        String driverlocation="E:\\Sanath\\Sellenium sw\\projects\\drivers\\chromedriver(1).exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


    }

    @Test

    public void checkTableData() throws InterruptedException {

            driver.get("https://www.freecrm.com/index.html");

            String Name = "testsel";
            String PW = "test@sel";
            reusableClass.loginCRM( driver, Name, PW);

        //Thread.sleep(20000);

        driver.switchTo().frame("mainpanel");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

            //method 1 using for loop
//       String before_XPath = "//form[@id='vContactsForm']/table[@class='datacard']/tbody/tr[";
//        String after_XPath = "]/td[2]/a";
//
//        for (int i = 4; i<=6;i++){
//
//
//            String Name1 = driver.findElement(By.xpath(before_XPath+i+after_XPath)).getText();
//
//            System.out.println(Name1);
////form[@id='vContactsForm']/table[@class='datacard']/tbody/tr[5]/td[2]/a
//        if(Name1.equals("tak uat")){
//
//           driver.findElement(By.xpath("//form[@id='vContactsForm']/table[@class='datacard']/tbody/tr["+i+"]/td[1]/input[@name='contact_id']")).click();
//            Thread.sleep(2000);
//
//        }
//
//        }

        //Method2 using sibling whic is good than method 1
        driver.findElement(By.xpath("//a[contains(text(),'jan kai')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'tak uat')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'test test')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();

        Thread.sleep(3000);
    }




  @AfterTest

    public void closeBrowser2(){

        driver.close();
        driver.quit();
    }
}
