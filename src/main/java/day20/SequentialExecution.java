
package day20;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import day20.Base;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

   public class SequentialExecution extends Base {
        @Test
        public void EMIApp() throws IOException {
            myTest = extent.createTest("EMI TestReport");
            myTest.log(Status.PASS,"App Launched Successfully");
            //Enter the value//
            driver.findElement(By.id("loanamount")).sendKeys("15000");
            myTest.log(Status.PASS,"Entered Loanamount");
            driver.findElement(By.id("rate")).sendKeys("20");
            myTest.log(Status.PASS,"Entered Rate");
            driver.findElement(By.id("pmonths")).sendKeys("10");
            myTest.log(Status.PASS,"Entered Pmonths");

            //Click the Button//
            driver.findElement(By.id("Button1")).click();
            String emi = driver.findElement(By.id("EMI")).getAttribute("value");
            System.out.println(emi);
            TakesScreenshot driver1 = (TakesScreenshot) driver;
            File screenshotAs = driver1.getScreenshotAs(OutputType.FILE);
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

        }
    }

