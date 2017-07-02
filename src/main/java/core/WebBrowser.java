package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebBrowser {
    private static WebDriver driver = null;
    private WebBrowser() {

    }

    public static WebDriver getInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void close() {
        if (null != driver){
            driver.quit();
        }
        driver = null;
    }
}
