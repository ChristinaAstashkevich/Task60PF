import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MailRuTest extends TestBase{
    private String email = "seleniumtests10@mail.ru";
    private String password = "060788avavav";

    @Test
    public void loginTest(){
        mailBoxPage = loginPage.login(email, password);
        Assert.assertTrue(mailBoxPage.isComposeButtonDisplayed(), "Compose button is not displayed");
    }

    @Test
    public void logoutTest(){
        mailBoxPage = loginPage.login(email, password);
        loginPage = mailBoxPage.logout();
        Assert.assertTrue(loginPage.isLoginButtonDisplayed(),"Login link is not displayed");
    }
}
