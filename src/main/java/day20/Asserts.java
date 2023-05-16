package day20;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asserts {

    public static void main(String[] args) {

        //    Launch the EMI Application
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

//        Verify the Title
        if (driver.getTitle().contains("Union Bank of India"))
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        Assert.assertTrue("Title is not matching", driver.getTitle().contains("Union Bank of India"));

        //Enter the value//
        driver.findElement(By.id("loanamount")).sendKeys("10000");
        driver.findElement(By.id("rate")).sendKeys("10");
        driver.findElement(By.id("pmonths")).sendKeys("120");

        //Click the Button//
        driver.findElement(By.id("Button1")).click();

        //Get EMI value//
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        if (output.equals("132.15"))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        Assert.assertEquals(output,"132.15","Emi is not matching");

        //Close the Browser
        driver.quit();
    }
}
