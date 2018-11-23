package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
     public void launch() {
        System.setProperty("webdriver.chrome.driver", "X:\\Vishnu\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://localhost:8180/pc/PolicyCenter.do");

    }
}