package day23;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

        String parentwindowHandle = driver.getWindowHandle();
        driver.findElement(By.partialLinkText("TDS Certificate")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle:windowHandles) {
            if (!handle.equals(parentwindowHandle))
            {
                driver.switchTo().window(handle);
            }
        }

        driver.findElement(By.id("custid")).sendKeys("12345");
        driver.switchTo().window(parentwindowHandle);

        driver.findElement(By.id("loanamount")).sendKeys("10000");
        driver.findElement(By.id("rate")).sendKeys("10");
        driver.findElement(By.id("pmonths")).sendKeys("100");

        driver.findElement(By.id("Button1")).click();

        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        if (output.equals("147.78"))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
