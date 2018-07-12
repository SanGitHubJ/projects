import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.File;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

public class TestGmail {

    public WebDriver driver;

    @BeforeMethod
    public void checkmail() {
        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("https://mail.google.com/");

    }

    @Test(priority = 1)
    public void sendMial() throws InterruptedException {

        driver.findElement((By.name("identifier"))).sendKeys("usercrossover");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement((By.name("password"))).sendKeys("usercrossover@123");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(4000);
        driver.findElement(By.id(":8w")).click();
        driver.findElement(By.name("to")).sendKeys("usercrossover2@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("test subject");
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("mail body");
       // WebElement upload = driver.findElement(By.xpath("//div[@command='Files']"));
        //upload.sendKeys("/home/sanath/Pictures/Screenshot.png");
//
//        String filename = "/home/sanath/Pictures/Screenshot.png";
//        File file = new File(filename);
//        String path = file.getAbsolutePath();
//        // give the URL to upload
//        driver.findElement(By.xpath("//div[@command='Files']")).sendKeys(path);

        driver.findElement(By.xpath("//td[@class='gU Up']")).click();





    }

    @Test(priority = 2)
    public void checkmailuser2() throws InterruptedException {

        driver.findElement((By.name("identifier"))).sendKeys("usercrossover2");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(2000);
        driver.findElement((By.name("password"))).sendKeys("usercrossover@123");
        driver.findElement(By.id("passwordNext")).click();
        //jk
        driver.findElement(By.xpath("//span[@class='bog' and contains(text(),'test subject')]")).click();

        String sb = driver.findElement(By.xpath("//h2[@class='hP']")).getText();
        System.out.println(sb);

        String mb = driver.findElement(By.xpath("//div[@dir='ltr' and contains(text(),'mail body')]")).getText();
        System.out.println(mb);

        Thread.sleep(2000);

        String att = driver.findElement(By.xpath("//div//span[@class='aV3 zzV0ie' and contains(text(),'Screenshot.png')]")).getText();
        System.out.println(att);

    }//

    @AfterMethod
    public void teardown(){
       driver.quit();


    }
}
