package DownloadFiles;

import net.bytebuddy.matcher.ElementMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DownloadFileConcept {

    WebDriver driver;

    File folder;

    @BeforeMethod
    public void setup() {

        folder = new File(UUID.randomUUID().toString());
        folder.mkdir();

        //file download from Chrome

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> pref = new HashMap<String, Object>();
        pref.put("profile.default_content_setting.popup", 0);
        pref.put("download.default_directory", folder.getAbsolutePath());
        options.setExperimentalOption("prefs", pref);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(cap);
    }

    @Test
    public void downloadFileTest() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[contains(text(),'some')]")).click();


        Thread.sleep(2000);
        File listOfFiles[] = folder.listFiles();
        // Assert.assertEquals(listOfFiles.length, is(not(0)));

        Assert.assertTrue(listOfFiles.length > 0);

        for (File file : listOfFiles) {

            //Assert.assertEquals(listOfFiles.length,is((not((long)0)));
            Assert.assertTrue(listOfFiles.length > 0);
        }

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
        for(File file:folder.listFiles()){

            file.delete();

        }
        folder.delete();

    }
}

