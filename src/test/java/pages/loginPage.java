package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Sanath on 5/8/2018.
 */

public class loginPage {
WebDriver driver;
    @FindBy (how=How.ID, using="log")public static WebElement txtUserName;
    @FindBy (how= How.ID, using="pwd")public static WebElement txtPassword;
    @FindBy (how=How.ID ,using="login")public static WebElement btnLogin;
    @FindBy(how=How.CSS, using="div[id='account']>a") public static WebElement icnLogin;
    //driver.findElement(By.cssSelector("div[id='account']>a"))

    @FindBy (how=How.CSS,using = "div[class=\"input-group\"]>input[name=\"username\"]") public static WebElement txtUN;
    @FindBy (how = How.CSS, using = "div[class=\"input-group\"]>input[name=\"password\"]") public static WebElement txtPW;
    @FindBy (how = How.XPATH, using = "/html//form[@id='loginForm']//input[@value='Login']") public static WebElement btnSubmit;


}
