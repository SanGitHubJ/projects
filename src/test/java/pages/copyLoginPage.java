package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Sanath on 5/9/2018.
 */
public class copyLoginPage {

    WebDriver driver;

    @FindBy(how = How.CSS,using = "div[id=\"account\"]>a") public static WebElement icnLogin;
    @FindBy (how = How.ID,using = "log") public static WebElement txtUserName;
    @FindBy (how = How.NAME, using = "pwd") public static WebElement txtPwd;
    @FindBy (how = How.ID,using ="login") public static WebElement btnLogin;
}
