package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;

public class Driver {
    public LoginPage launch() {
        System.setProperty("webdriver.chrome.driver", "X:\\Vishnu\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mocktrading.com/");
        return new LoginPage(driver);
    }
}