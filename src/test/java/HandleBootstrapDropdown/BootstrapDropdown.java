package HandleBootstrapDropdown;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BootstrapDropdown {

   public static WebDriver driver;

    public static void main(String[] args) {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



        driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");

        driver.findElement(By.ByClassName.xpath("//button[contains(text(),'Open Web Tutorials')]")).click();

        java.util.List<WebElement> list = driver.findElements(By.xpath("//a[contains(@class,'dropdown-item')]"));

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i).getText());

            if(list.get(i).getText().contains("jQuery")){ //can use equal = contains
                list.get(i).click();
                break;
            }
        }



    }


}
