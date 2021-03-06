package page;

import core.WebBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver = WebBrowser.getInstance();

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mailbox__login")
    private WebElement loginField;

    @FindBy(id = "mailbox__password")
    private WebElement passwordField;

    @FindBy(id = "mailbox__auth__button")
    private WebElement loginButton;

    public MailBoxPage login(String email, String password) {
        loginField.click();
        loginField.sendKeys(email);
        passwordField.click();
        passwordField.sendKeys(password);
        loginButton.click();
        return new MailBoxPage(driver);
    }

    public boolean isLoginButtonDisplayed() {
        return loginButton.isDisplayed();
    }
}
