package KeyPressEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class KeyPressEvent {

    @Test
    public void keyEventTest(){

        String driverlocation = "/home/sanath/Applications/Drivers/chromedriver";
        File driverPath = new File(driverlocation);
        System.setProperty("webdriver.chrome.driver", driverPath.toString());

        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/key_presses");

       // driver.findElement(By.id("content")).sendKeys(Keys.SPACE);

        Actions action = new Actions(driver);
        action.sendKeys(Keys.SEMICOLON).build().perform();
        String text = driver.findElement(By.id("result")).getText();
        System.out.println(text);
        Assert.assertEquals(text,"You entered: ");


    }
}
