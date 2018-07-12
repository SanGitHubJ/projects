package ToFindBrokenLinkImages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ToFindBrokenLinknImags {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



        driver.get("https://www.google.com");

                //get all link and images
        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        linklist.addAll(driver.findElements(By.tagName("img")));

        System.out.println("Total availab;e link >>>"+linklist.size());

        List<WebElement> actlink = new ArrayList<WebElement>();

                //itereate link and get href does not have blank
        for(int i=0;i<linklist.size();i++){

            System.out.println(linklist.get(i).getAttribute("href"));
            if(linklist.get(i).getAttribute("href") !=null && (!linklist.get(i).getAttribute("href").contains("javascript"))){
                actlink.add(linklist.get(i));
                //System.out.println("Blank Href are>>>"+actlink.get(i).getText());
              //  System.out.println("Blank Href are name>>>"+actlink.get(i).getAttribute("href"));
            }
            //System.out.println("Blank Href are>>>"+actlink.get(i).getText());
            System.out.println("Active Href are name>>>"+actlink.get(i).getAttribute("href"));
        }
        //get the active link size
        System.out.println("List of active link with Href>>>"+actlink.size());


            //to check active href url with httpsconnetion api

        for(int j=0;j<actlink.size();j++){

            HttpURLConnection connection = (HttpURLConnection)new URL(actlink.get(j).getAttribute("href")).openConnection(); //castintg tp httpconnection
            connection.connect();
            String responce = connection.getResponseMessage(); // return OK
            connection.disconnect();

            System.out.println(actlink.get(j).getAttribute("href")+"----->>" + responce);
        }
    }
}
