import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PickUpCalenderDates {

    public WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("https://www.skyscanner.com.sg/");


    }

//    @Test
//    public void pickUpCalDates() throws InterruptedException {
//
//        //driver.findElement(By.id("//input[@id='depart-fsc-datepicker-input' and @name='depart-fsc-datepicker-input']")).click();
//
//        driver.findElement(By.xpath("//input[@name='depart-fsc-datepicker-input']")).click();
//
//        Thread.sleep(3000);
//
//        String currMonth =  driver.findElement(By.xpath("//select[@id='depart-calendar__bpk_calendar_nav_select']//"
//                +"option[contains(text(),'May 2018')]")).getText();
//
//       // driver.findElement(By.id("depart-calendar__bpk_calendar_nav_month_nudger_next")).click();
//
//        String expecMonth = "July 2018";
//
//       // driver.findElement(By.id("depart-calendar__bpk_calendar_nav_month_nudger_next")).click();
//
//
//            if(expecMonth.equals(currMonth)){
//
//                System.out.println("Expacted month is already selected >>");
//
//            }else{
//
//                for(int i=0; i<12; i++){
//
//                        Thread.sleep(3000);
//                    driver.findElement(By.id("depart-calendar__bpk_calendar_nav_month_nudger_next")).click();
//
//                    Thread.sleep(3000);
//
//                    currMonth =  driver.findElement(By.xpath("//select[@id='depart-calendar__bpk_calendar_nav_select']//"
//                            +"option[contains(text(),'July 2018')]")).getText();
//                    if(expecMonth.equals(currMonth)){
//
//                        System.out.println("month is selected asExpacted>>");
//                        break;
//                    }
//
//                }
//            }
//
//        WebElement datepicker = driver.findElement(By.xpath("//table//tbody//tr//td//button"));
//
//            List<WebElement> dates = datepicker.findElements(By.tagName("span"));
//
//                for(WebElement date : dates){
//
//                        String caldate = date.getText();
//
//                        if(caldate.equals("28")){
//
//                            date.click();
//                            break;
//                        }
//
//
//                }
//
//
//
//    }

    @Test
    public void datePickerByArray() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"depart-fsc-datepicker-input\"]")).click();

        String ExpectedDate = "9-September 2018";
        String dataArra[] = ExpectedDate.split("-");
        String date = dataArra[0];
        String MonthYer = dataArra[1];

        driver.findElement(By.xpath("//*[@id=\"depart-fsc-datepicker-input\"]"));


        String beforeXapathMY = "//*[@id=\"depart-calendar__bpk_calendar_nav_select\"]/option[";

       // String beforeXapathMY = "//*[@id="depart-calendar__bpk_calendar_nav_select"]/option[";

        String afterXpathMY = "]";

        boolean flag=false;
        //*[@id="depart-calendar__bpk_calendar_nav_select"]/option[9]
        //*[@id="depart-calendar__bpk_calendar_nav_select"]/option[1]
        //*[@id="depart-calendar__bpk_calendar_nav_select"]/option[2]
            for(int i=1;i<14;i++) {
                Thread.sleep(3000);
                Select YM = new Select(driver.findElement(By.xpath(beforeXapathMY + i + afterXpathMY)));
                //if(YM.equals(MonthYer)) {
                    YM.selectByVisibleText(MonthYer);
                   // flag = true;
                   // break;
               // }

            }

//*[@id="depart-fsc-datepicker-input-popover"]/div/div[2]/div/table/tbody/tr[3]/td[4]/button
        //*[@id="depart-fsc-datepicker-input-popover"]/div/div[2]/div/table/tbody/tr[6]/td[7]/button/span

    }
    @AfterMethod
    public void tearDown(){

//        driver.quit();
    }
}
