package automatedScripts.Commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseScript {
    public WebDriver driver;
    @BeforeMethod
    public void launchApp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://books.rediff.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }

}
