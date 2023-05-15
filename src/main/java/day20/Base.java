package day20;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Base {
    public WebDriver driver;
    public static ExtentReports extent;
    public ExtentTest myTest;

    @BeforeSuite
    public void reportSetup()
    {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark3.html");
        extent.attachReporter(spark);
        myTest = extent.createTest("EMI TestReport");
        myTest.log(Status.PASS,"App Launched Successfully");
    }
    @Parameters("browser")
    @BeforeMethod
    public void launchApp(String browser)
    {
        switch (browser) {
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
                driver.manage().window().maximize();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
                driver.manage().window().maximize();
                break;
        }
    }
    @AfterMethod
    public void teardown()
    {
        extent.flush();
        driver.quit();
    }

}
