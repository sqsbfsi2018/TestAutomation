package page;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage login(String username, String password) {
        driver.findElement(By.name("UserIDCheck")).sendKeys(username);
        driver.findElement(By.name("UserPWDCheck")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='button']")).click();

        return this;
    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        FileHandler.copy(((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE), new File("X:\\Vishnu\\git_project\\Login.png"));
    }

}