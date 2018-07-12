package WriteTestResultIntoExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class WriteTestResultToExcel {

    public WebDriver driver;

    public boolean flag = false;

    @BeforeTest
    public void openBrowser(){

        String driverlocation="/home/sanath/Applications/Drivers/chromedriver";
        File driverPath= new File(driverlocation);
        System.setProperty("webdriver.chrome.driver",driverPath.toString());
        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("http://www.google.com");



    }

    @Test
    public void writeToExcel() throws IOException {

        File src = new File("/home/sanath/Workplace/Selenium/Intellij/projects/"
                +"src/test/java/WriteTestResultIntoExcel/TestData.xlsx");

        FileInputStream fis = new FileInputStream(src);
       // FileOutputStream fis = new FileOutputStream(src);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);

        flag=false;
        if (flag){
        sheet.getRow(0).createCell(2).setCellValue("Pass");}
        else {
            sheet.getRow(0).createCell(2).setCellValue("Fail");
        }
        sheet.getRow(2).createCell(2).setCellValue("Pass");
        //sheet.getRow(3).createCell(2).setCellValue("Fail");

        FileOutputStream fout = new FileOutputStream(src);
        workbook.write(fout);
        workbook.close();




        //FileOutputStream newexcel = new FileOutputStream(src);

        //XSSFWorkbook workbk = new XSSFWorkbook(newexcel);




    }

    @AfterMethod
    public void  tearDown(){

        driver.quit();
    }


}
