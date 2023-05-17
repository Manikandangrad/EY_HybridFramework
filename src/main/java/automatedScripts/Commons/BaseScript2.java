package automatedScripts.Commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseScript2 {
   public WebDriver driver;
   public static ExtentReports extent;
    public ExtentTest mytest;
    /**
     * Initialise the Report
     */
    @BeforeSuite
   public void reportSetup()
   {
       extent = new ExtentReports();
       ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark5.html");
       extent.attachReporter(spark);

   }

    /**
     * Launch the Application
     */
    @Parameters("browser")
   @BeforeMethod
    public void launchApp(String browser)
    {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
//
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        driver.get("https://books.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    /**
     * to create screenshot and get the file path
     * @return: the screenshot file path
     * @throws IOException
     */
    public String ScreenShot() throws IOException {
        TakesScreenshot driver1 = (TakesScreenshot) driver;
        File screenshotAs = driver1.getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SS");
        String format = simpleDateFormat.format(date);
        String property = System.getProperty("user.dir") + "\\src\\main\\resources\\screenshots" + format +".png";
        FileUtils.copyFile(screenshotAs,new File(property));
        return property;
    }


    /**
     * Close the Application
     */

    @AfterMethod
    public void teardown()
    {
        extent.flush();
        driver.quit();
    }
}
