package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.LoginPage;
import page.MailBoxPage;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected MailBoxPage mailBoxPage;

    @BeforeTest
    public void setup() {
        this.driver = WebBrowser.getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");

        loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void tearDown() {
        WebBrowser.close();
    }
}
