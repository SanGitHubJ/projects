import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.loginPage;

/**
 * Created by Sanath on 5/8/2018.
 */
public class reusableClass {
    public WebDriver driver;

    public static void login(WebDriver driver,String Name,String pw) {

        PageFactory.initElements(driver, loginPage.class);
        loginPage.icnLogin.click();

        // Thread.sleep(5000);
        loginPage.txtUserName.sendKeys(Name);
        loginPage.txtPassword.sendKeys(pw);
        loginPage.btnLogin.click();

    }

    public static  void loginCRM(WebDriver driver,String Name, String PW) throws InterruptedException {

        PageFactory.initElements(driver,loginPage.class);

        loginPage.txtUN.sendKeys(Name);
        loginPage.txtPW.sendKeys(PW);
        Thread.sleep(2000);
        loginPage.btnSubmit.click();

        //Thread.sleep(4000);
    }

}
