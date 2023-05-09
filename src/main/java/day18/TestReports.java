package day18;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReports {

    public static void main(String[] args) throws IOException {
    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
    extent.attachReporter(spark);
        ExtentTest myTest = extent.createTest("EMI TestReport");
        myTest.log(Status.PASS, "Started the Test");

        //Open the browser//
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        //Launch the browser//
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");

        //Maximize the window//
        driver.manage().window().maximize();

        myTest.log(Status.PASS,"Launched the Browser");

//        TakesScreenshot driver1 = (TakesScreenshot) driver;
//        File screenshotAs1 = driver1.getScreenshotAs(OutputType.FILE);
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SS");
//        String format = simpleDateFormat.format(date);
//        String property = System.getProperty("user.dir") + "\\src\\main\\resources\\screenshots" + format +".png";
//        FileUtils.copyFile(screenshotAs1,new File(property));
//
//        myTest.log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(property.replace(System.getProperty("user.dir"),"")).build());

        //Enter the value//
        driver.findElement(By.id("loanamount")).sendKeys("15000");
        myTest.log(Status.PASS,"Entered the LoanAmount");

        driver.findElement(By.id("rate")).sendKeys("20");
        myTest.log(Status.PASS,"Entered the Rate");

        driver.findElement(By.id("pmonths")).sendKeys("10");
        myTest.log(Status.PASS,"Entered the Pmonths");

        //Click the Button//
        driver.findElement(By.id("Button1")).click();

        //Check if output equals//
        String emi = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(emi);

        TakesScreenshot driver1 = (TakesScreenshot) driver;
        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy hh-MM-ss-SS");
        String format = simpleDateFormat.format(date);
        String property = System.getProperty("user.dir") + "\\src\\main\\resources\\screenshots" + format +".png";
        FileUtils.copyFile(screenshotAs,new File(property));
        myTest.log(Status.PASS,"The output is:"+emi);
        if (emi.equals("1642.91"))
        {
            System.out.println("Pass");
            myTest.log(Status.PASS,"Passed");
        }
        else
        {
            System.out.println("Fail");
            myTest.log(Status.FAIL,"Failed"+emi, MediaEntityBuilder.createScreenCaptureFromPath(property.replace(System.getProperty("user.dir"),"")).build());
        }

        //Close the Browser
        myTest.log(Status.PASS,"Closed the Browser");
        extent.flush();
        driver.quit();
}
}