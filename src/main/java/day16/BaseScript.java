package day16;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseScript {
    public WebDriver driver;
@BeforeMethod
public void launchApplication(){
    //    Launch the EMI Application
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
    this.driver=new ChromeDriver();
    driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
    driver.manage().window().maximize();
}
@AfterMethod
public void teardown(){
//    Close the Browser
    driver.quit();
}
}

