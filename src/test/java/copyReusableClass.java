import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sanath on 5/9/2018.
 */
import pages.copyLoginPage;

public class copyReusableClass {

    public WebDriver driver;

    public static void login(WebDriver driver,String name, String pw){

        PageFactory.initElements(driver, copyLoginPage.class);

        copyLoginPage.icnLogin.click();
        copyLoginPage.txtUserName.sendKeys(name);
        copyLoginPage.txtPwd.sendKeys(pw);
        copyLoginPage.btnLogin.click();
    }

}
