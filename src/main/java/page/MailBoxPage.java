package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailBoxPage {
    private WebDriver driver;

    public MailBoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-name='compose']")
    private WebElement composeButton;

    @FindBy(id = "PH_logoutLink")
    private WebElement logoutLink;

    public LoginPage logout(){
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(logoutLink));
        logoutLink.click();
        return new LoginPage(driver);
    }

    public boolean isComposeButtonDisplayed(){
        return composeButton.isDisplayed();
    }
}


