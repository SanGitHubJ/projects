import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.ss.usermodel.Workbook;jkjkjkjkj


/**
 * Created by Sanath J on 5/15/2018.
 */
public class itereteExcelData {

    public WebDriver driver;

       @BeforeTest
    public void openBrowser(){

        String driverlocation="E:\\Sanath\\SelleniumNew\\projects\\drivers\\chromedriver(1).exe";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



    }

  @Test
    public void testCase() throws Exception {

        driver.manage().window().maximize();
        driver.get("https://www.freecrm.com/index.html");

        Thread.sleep(3000);
        ArrayList<String> usrName = readExcelData(0);
        ArrayList<String> pw = readExcelData(1);

            for(int i=0;i<usrName.size();i++) {
                driver.findElement(By.cssSelector("div[class='input-group'] > input[name='username']")).sendKeys(usrName.get(i));
                takeScreenShot.screenShot(driver,"UserName");
                getLogs.logCapture();
                driver.findElement(By.cssSelector("div[class='input-group'] > input[name='password']")).sendKeys(pw.get(i));
                takeScreenShot.screenShot(driver,"Password");
                getLogs.logCapture();
                driver.findElement(By.cssSelector("div[class='input-group-btn'] > input[type='submit']")).click();
                getLogs.logCapture();


                driver.switchTo().frame("mainpanel");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
                getLogs.logCapture();
            }


    }



    public ArrayList<String> readExcelData(int colNum) throws Exception {


        // String path = "E:\\Sanath\\Sellenium sw\\projects\\DataEngine..xlsx";

        //String name = "CRMURS";
        FileInputStream exl = new FileInputStream("E://Sanath//SelleniumNew//projects//DataEngine.xlsx");
       // ExcelWBook = WorkbookFactory.create(exl);
        XSSFWorkbook ExcelWBook = new XSSFWorkbook(exl);
        XSSFSheet ExcelWSheet = ExcelWBook.getSheet("CRMURS");

        Iterator<org.apache.poi.ss.usermodel.Row> getrw = ExcelWSheet.iterator();

        getrw.next();
        ArrayList<String> List = new ArrayList<String>();
        while (getrw.hasNext()) {


            List.add(getrw.next().getCell(colNum).getStringCellValue());
            System.out.println(List.add(getrw.next().getCell(colNum).getStringCellValue()));
           // return List;
        }


        // @AfterTest
       //System.out.println(getrw.next().getCell(colNum));
        return List;
    }

@AfterTest

    public void closeBrowser(){

    driver.close();
    driver.quit();
}

}
