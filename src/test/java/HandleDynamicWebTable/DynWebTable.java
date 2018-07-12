package HandleDynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DynWebTable {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);


        driver.get("https://www.w3schools.com/html/html_tables.asp");

        DynWebTable tablenew = new DynWebTable();
        tablenew.table();


    }

    public void table(){

        ////*[@id="customers"]/tbody/tr[2]/td[1]
        ////*[@id="customers"]/tbody/tr[2]/td[2]
        ////*[@id="customers"]/tbody/tr[2]/td[3]
        ////*[@id="customers"]/tbody/tr[4]/td[1]

        List<WebElement> rowcount = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr["));

        int rowcounts = rowcount.size();

        String beforeXPath = "//*[@id=\"customers\"]/tbody/tr[";
        String afterXPath = "]/td[";

        String tablelists = null;
        for (int row=2;row<rowcounts;row++){

            for (int col =1;col<=3;col++){
                try {
                   WebElement tablelist = driver.findElement(By.xpath(beforeXPath + row + afterXPath + col + "]"));
                   //tablelist.getText();
                    System.out.println(tablelist.getText());
                }catch (NoSuchElementException e){
                    System.out.println("pls enter correct row");
                }
            }
        }


    }
}
