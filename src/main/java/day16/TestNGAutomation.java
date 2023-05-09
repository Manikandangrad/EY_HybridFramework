package day16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGAutomation extends BaseScript {
    @Test(priority = 1)
    public void ValidCalculations() {
        //Enter the value//
        driver.findElement(By.id("loanamount")).sendKeys("20000");
        driver.findElement(By.id("rate")).sendKeys("8");
        driver.findElement(By.id("pmonths")).sendKeys("6");

        //Click the Button//
        driver.findElement(By.id("Button1")).click();

//        Verify the EMI result for Valid Output
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        if (output.equals("3411.54")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    //         Verify the EMI result without entering values
    @Test(priority = 2)
    public void InvalidCalculations() {
//        Click the Button//
        driver.findElement(By.id("Button1")).click();

//        Close the alert message
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        if (alertText.equals("Please Enter Loan Amount")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        //Click on the Button to accept
        alert.accept();
    }

//                Using Data Provider
    @Test(priority = 3,dataProvider = "DataProvider", dataProviderClass = DataProvider.class)
    public void Datacheck(String amount, String rate) {
        System.out.println(amount);
        System.out.println(rate);
    }
}
