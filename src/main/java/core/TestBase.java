package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import page.LoginPage;
import page.MailBoxPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected MailBoxPage mailBoxPage;
    public static final String URL = "https://mail.ru/";

    @BeforeMethod
    public void setup() {
        this.driver = WebBrowser.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);

        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        WebBrowser.close();
    }
}
